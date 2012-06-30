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

import com.intellij.tasks.Comment;
import no.norrs.launchpad.tasks.internal.BugComment;

import java.util.Date;

public class LaunchpadComment extends Comment {
    private final BugComment myComment;

    public LaunchpadComment(BugComment myComment) {
        this.myComment = myComment;
    }

    @Override
    public String getText() {
        return null;
    }

    @Override
    public String getAuthor() {
        return null;
    }

    @Override
    public Date getDate() {
        return null;
    }
}
