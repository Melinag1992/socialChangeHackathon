package com.example.melg.recruit.models;

public class GitProjects {


    private String projectName;
    private String projectUrl;
    private String projectVideo;


    public GitProjects(String projectName, String projectUrl, String projectVideo) {
        this.projectName = projectName;
        this.projectUrl = projectUrl;
        this.projectVideo = projectVideo;
    }


    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectUrl() {
        return projectUrl;
    }

    public void setProjectUrl(String projectUrl) {
        this.projectUrl = projectUrl;
    }

    public String getProjectVideo() {
        return projectVideo;
    }

    public void setProjectVideo(String projectVideo) {
        this.projectVideo = projectVideo;
    }
}
