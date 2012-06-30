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

package no.norrs.launchpad.tasks.internal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Bug implements Serializable {
    String dateClosed;
    String dateAssigned;
    String title;
    String bugLink;
    String bugWatchLink;
    String milestoneLink;
    String dateLeftClosed;
    String dateFixCommited;
    String dateFixReleased;
    String dateInProgress;
    String resourceTypeLink;
    String status;
    String bugTargetName;
    String importance;
    String assigneeLink;
    String dateTriaged;
    String selfLink;
    String targetLink;
    String bugTargetDisplayName;
    String relatedTasksCollectionLink;
    String dateConfirmed;
    String dateLeftNew;
    String webLink;
    String ownerLink;
    String dateCreated;
    String dateIncomplete;
    boolean isComplete;

    String etag;

    @JsonProperty(value = "date_closed")
    public String getDateClosed() {
        return dateClosed;
    }

    @JsonProperty(value = "date_closed")
    public void setDateClosed(String dateClosed) {
        this.dateClosed = dateClosed;
    }

    @JsonProperty(value = "date_assigned")
    public String getDateAssigned() {
        return dateAssigned;
    }

    @JsonProperty(value = "date_assigned")
    public void setDateAssigned(String dateAssigned) {
        this.dateAssigned = dateAssigned;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty(value = "bug_link")
    public String getBugLink() {
        return bugLink;
    }

    @JsonProperty(value = "bug_link")
    public void setBugLink(String bugLink) {
        this.bugLink = bugLink;
    }

    @JsonProperty(value = "bug_watch_link")
    public String getBugWatchLink() {
        return bugWatchLink;
    }

    @JsonProperty(value = "bug_watch_link")
    public void setBugWatchLink(String bugWatchLink) {
        this.bugWatchLink = bugWatchLink;
    }

    @JsonProperty(value = "milestone_link")
    public String getMilestoneLink() {
        return milestoneLink;
    }

    @JsonProperty(value = "milestone_link")
    public void setMilestoneLink(String milestoneLink) {
        this.milestoneLink = milestoneLink;
    }

    @JsonProperty(value = "date_left_closed")
    public String getDateLeftClosed() {
        return dateLeftClosed;
    }

    @JsonProperty(value = "date_left_closed")
    public void setDateLeftClosed(String dateLeftClosed) {
        this.dateLeftClosed = dateLeftClosed;
    }

    @JsonProperty(value = "date_fix_committed")
    public String getDateFixCommited() {
        return dateFixCommited;
    }

    @JsonProperty(value = "date_fix_committed")
    public void setDateFixCommited(String dateFixCommited) {
        this.dateFixCommited = dateFixCommited;
    }

    @JsonProperty(value = "date_fix_released")
    public String getDateFixReleased() {
        return dateFixReleased;
    }

    @JsonProperty(value = "date_fix_released")
    public void setDateFixReleased(String dateFixReleased) {
        this.dateFixReleased = dateFixReleased;
    }

    @JsonProperty(value = "date_in_progress")
    public String getDateInProgress() {
        return dateInProgress;
    }

    @JsonProperty(value = "date_in_progress")
    public void setDateInProgress(String dateInProgress) {
        this.dateInProgress = dateInProgress;
    }

    @JsonProperty(value = "resource_type_link")
    public String getResourceTypeLink() {
        return resourceTypeLink;
    }

    @JsonProperty(value = "resource_type_link")
    public void setResourceTypeLink(String resourceTypeLink) {
        this.resourceTypeLink = resourceTypeLink;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty(value = "bug_target_name")
    public String getBugTargetName() {
        return bugTargetName;
    }

    @JsonProperty(value = "bug_target_name")
    public void setBugTargetName(String bugTargetName) {
        this.bugTargetName = bugTargetName;
    }


    public String getImportance() {
        return importance;
    }

    public void setImportance(String importance) {
        this.importance = importance;
    }

    @JsonProperty(value = "assignee_link")
    public String getAssigneeLink() {
        return assigneeLink;
    }

    @JsonProperty(value = "assignee_link")
    public void setAssigneeLink(String assigneeLink) {
        this.assigneeLink = assigneeLink;
    }

    @JsonProperty(value = "date_triaged")
    public String getDateTriaged() {
        return dateTriaged;
    }

    @JsonProperty(value = "date_triaged")
    public void setDateTriaged(String dateTriaged) {
        this.dateTriaged = dateTriaged;
    }

    @JsonProperty(value = "self_link")
    public String getSelfLink() {
        return selfLink;
    }

    @JsonProperty(value = "self_link")
    public void setSelfLink(String selfLink) {
        this.selfLink = selfLink;
    }

    @JsonProperty(value = "target_link")
    public String getTargetLink() {
        return targetLink;
    }

    @JsonProperty(value = "target_link")
    public void setTargetLink(String targetLink) {
        this.targetLink = targetLink;
    }

    @JsonProperty(value = "bug_target_display_name")
    public String getBugTargetDisplayName() {
        return bugTargetDisplayName;
    }

    @JsonProperty(value = "bug_target_display_name")
    public void setBugTargetDisplayName(String bugTargetDisplayName) {
        this.bugTargetDisplayName = bugTargetDisplayName;
    }

    @JsonProperty(value = "related_tasks_collection_link")
    public String getRelatedTasksCollectionLink() {
        return relatedTasksCollectionLink;
    }

    @JsonProperty(value = "related_tasks_collection_link")
    public void setRelatedTasksCollectionLink(String relatedTasksCollectionLink) {
        this.relatedTasksCollectionLink = relatedTasksCollectionLink;
    }

    @JsonProperty(value = "date_confirmed")
    public String getDateConfirmed() {
        return dateConfirmed;
    }

    @JsonProperty(value = "date_confirmed")
    public void setDateConfirmed(String dateConfirmed) {
        this.dateConfirmed = dateConfirmed;
    }

    @JsonProperty(value = "date_left_new")
    public String getDateLeftNew() {
        return dateLeftNew;
    }

    @JsonProperty(value = "date_left_new")
    public void setDateLeftNew(String dateLeftNew) {
        this.dateLeftNew = dateLeftNew;
    }

    @JsonProperty(value = "web_link")
    public String getWebLink() {
        return webLink;
    }

    @JsonProperty(value = "web_link")
    public void setWebLink(String webLink) {
        this.webLink = webLink;
    }

    @JsonProperty(value = "owner_link")
    public String getOwnerLink() {
        return ownerLink;
    }

    @JsonProperty(value = "owner_link")
    public void setOwnerLink(String ownerLink) {
        this.ownerLink = ownerLink;
    }

    @JsonProperty(value = "date_created")
    public String getDateCreated() {
        return dateCreated;
    }

    @JsonProperty(value = "date_created")
    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    @JsonProperty(value = "date_incomplete")
    public String getDateIncomplete() {
        return dateIncomplete;
    }

    @JsonProperty(value = "date_incomplete")
    public void setDateIncomplete(String dateIncomplete) {
        this.dateIncomplete = dateIncomplete;
    }

    @JsonProperty(value = "is_complete")
    public boolean isComplete() {
        return isComplete;
    }

    @JsonProperty(value = "is_complete")
    public void setComplete(boolean complete) {
        isComplete = complete;
    }

    @JsonProperty(value = "http_etag")
    public String getEtag() {
        return etag;
    }

    @JsonProperty(value = "http_etag")
    public void setEtag(String etag) {
        this.etag = etag;
    }

    @Override
    public String toString() {
        return "Bug{" +
                "dateClosed='" + dateClosed + '\'' +
                ", dateAssigned='" + dateAssigned + '\'' +
                ", title='" + title + '\'' +
                ", bugLink='" + bugLink + '\'' +
                ", bugWatchLink='" + bugWatchLink + '\'' +
                ", milestoneLink='" + milestoneLink + '\'' +
                ", dateLeftClosed='" + dateLeftClosed + '\'' +
                ", dateFixCommited='" + dateFixCommited + '\'' +
                ", dateFixReleased='" + dateFixReleased + '\'' +
                ", dateInProgress='" + dateInProgress + '\'' +
                ", resourceTypeLink='" + resourceTypeLink + '\'' +
                ", status='" + status + '\'' +
                ", bugTargetName='" + bugTargetName + '\'' +
                ", importance='" + importance + '\'' +
                ", assigneeLink='" + assigneeLink + '\'' +
                ", dateTriaged='" + dateTriaged + '\'' +
                ", selfLink='" + selfLink + '\'' +
                ", targetLink='" + targetLink + '\'' +
                ", bugTargetDisplayName='" + bugTargetDisplayName + '\'' +
                ", relatedTasksCollectionLink='" + relatedTasksCollectionLink + '\'' +
                ", dateConfirmed='" + dateConfirmed + '\'' +
                ", dateLeftNew='" + dateLeftNew + '\'' +
                ", webLink='" + webLink + '\'' +
                ", ownerLink='" + ownerLink + '\'' +
                ", dateCreated='" + dateCreated + '\'' +
                ", dateIncomplete='" + dateIncomplete + '\'' +
                ", isComplete=" + isComplete +
                ", etag='" + etag + '\'' +
                '}';
    }
}
