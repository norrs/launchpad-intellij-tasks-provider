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

import com.intellij.openapi.util.IconLoader;
import com.intellij.tasks.Comment;
import com.intellij.tasks.Task;
import com.intellij.tasks.TaskType;
import no.norrs.launchpad.tasks.internal.Bug;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.util.Date;


public class LaunchpadTask extends Task {

    private final Bug launchpadBug;

    public LaunchpadTask(Bug launchpadBug) {
        this.launchpadBug = launchpadBug;
    }

    @NotNull
    @Override
    public String getId() {
        String[] bugLink = launchpadBug.getBugLink().split("\\/");
        return String.format("#%s", bugLink[bugLink.length - 1]);
    }

    @NotNull
    @Override
    public String getSummary() {
        // Bug #ID - BUG_TARGET_DISPLAY_NAME: <Sumary here>
        // ie: "Bug #887526 in Network Administration Visualized: \"ImapsChecker causes servicemon to hog the CPU\"",
        String summary = launchpadBug.getTitle().substring(4 + getId().length() + 4 + launchpadBug.getBugTargetDisplayName().length() + 1);
        return String.format(summary);
    }

    @Override
    public String getDescription() {
        return String.format(launchpadBug.getTitle());
    }

    @NotNull
    @Override
    public Comment[] getComments() {
        return new Comment[0];
    }

    @NotNull
    @Override
    public TaskType getType() {
        return TaskType.BUG;
    }

    @Override
    public Date getUpdated() {
        return null;
    }

    @Override
    public Date getCreated() {
        return null;
    }

    @Override
    public boolean isClosed() {
        return launchpadBug.isComplete();
    }

    @Override
    public String getCustomIcon() {
        return null;
    }

    public Icon getIcon() {
        return IconLoader.getIcon("/resources/launchpad-logo.png");
    }

    @Override
    public boolean isIssue() {
        return true;
    }

    @Override
    public String getIssueUrl() {
        return launchpadBug.getWebLink();
    }
}
