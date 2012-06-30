/*
 * Copyright 2012 Roy Sindre Norangshol
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package no.norrs.launchpad.tasks;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.intellij.openapi.diagnostic.Logger;
import com.intellij.tasks.Task;
import com.intellij.tasks.impl.BaseRepository;
import com.intellij.tasks.impl.BaseRepositoryImpl;
import no.norrs.launchpad.tasks.internal.Bug;
import no.norrs.launchpad.tasks.internal.BugTask;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.methods.GetMethod;
import org.jetbrains.annotations.Nullable;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class LaunchpadRepository extends BaseRepositoryImpl {
    private final static Logger LOG = Logger.getInstance("#no.norrs.launchpad.tasks.LaunchpadRepository");
    private ObjectMapper mapper;

    public LaunchpadRepository() {
        super();
        init();
    }

    public LaunchpadRepository(LaunchpadRepositoryType type) {
        super(type);
        init();
    }

    private LaunchpadRepository(LaunchpadRepository other) {
        super(other);
        init();
    }

    private void init() {
        this.mapper = new ObjectMapper();

        //mapper.configure(JsonFactory.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    @Override
    public Task[] getIssues(@Nullable String query, int max, long since) throws Exception {
        StringBuilder url = new StringBuilder((getUrl()));
        url.append("?ws.op=searchTasks");

        return processEndpoint(url.toString(), login());

    }


    @Override
    public Task findTask(String id) throws Exception {
        Task[] tasks = getIssues(null, 1, 0);
        for (Task task : tasks) {
            if (task.getId().equalsIgnoreCase(id)) {
                return task;
            }
        }
        return null;
    }

    @Override
    public BaseRepository clone() {
        return new LaunchpadRepository(this);
    }

    private Task[] processEndpoint(String url, HttpClient client) throws IOException {
        GetMethod method = new GetMethod(url);
        configureHttpMethod(method);
        client.executeMethod(method);

        int code = method.getStatusCode();
        if (code != HttpStatus.SC_OK) {
            throw new IOException(code == HttpStatus.SC_BAD_REQUEST ?
                    method.getResponseBodyAsString() : ("HTTP " + code + " (" + HttpStatus.getStatusText(code) + ") " + method.getStatusText()));
        }

        BugTask bugTask = mapper.readValue(method.getResponseBodyAsStream(), BugTask.class);
        List<Bug> bugs = bugTask.getEntries();
        List<Task> tasks = new ArrayList<Task>();
        for (Bug bug : bugs) {
            tasks.add(new LaunchpadTask(bug));
        }
        LOG.debug(String.format("Tasks size: %s", tasks.size()));

        return tasks.toArray(new Task[]{});
    }

    private HttpClient login() throws IOException {
        HttpClient client = getHttpClient();
        return client;
    }

    @Override
    public CancellableConnection createCancellableConnection() {
        StringBuilder url = new StringBuilder((getUrl()));
        url.append("?ws.op=searchTasks");
        GetMethod method = new GetMethod(url.toString());

        return new HttpTestConnection<GetMethod>(method) {

            @Override
            public void doTest(GetMethod method) throws Exception {
                HttpClient client = getHttpClient();
                client.executeMethod(myMethod);

                int statusCode = myMethod.getStatusCode();
                if (statusCode != HttpStatus.SC_OK) {
                    throw new IOException("Can't reach resource: " + statusCode + " (" + HttpStatus.getStatusText(statusCode) + ")");
                }
                Task[] results = getIssues(null, 1, 0);
                if (results.length < 1)
                    throw new IOException("No results fetched, sure this is correct endpoint?");
            }
        };
    }

}
