package com.example.melg.recruit.Recruit.models;

import java.util.List;

public class User extends Person{
    private String gitHubUrl;
    private String jobTitle;
    private String resumeLocation;
    private List<String> keyWords;
    private List<GitProjects> projects;

    public User(String firstName, String lastName, String email, String gitHubUrl, String jobTitle, String resumeLocation, List<String> keyWords, List<GitProjects> projects) {
        super(firstName, lastName, email);
        this.gitHubUrl = gitHubUrl;
        this.jobTitle = jobTitle;
        this.resumeLocation = resumeLocation;
        this.keyWords = keyWords;
        this.projects = projects;
    }


    public String getGitHubUrl() {
        return gitHubUrl;
    }

    public void setGitHubUrl(String gitHubUrl) {
        this.gitHubUrl = gitHubUrl;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getResumeLocation() {
        return resumeLocation;
    }

    public void setResumeLocation(String resumeLocation) {
        this.resumeLocation = resumeLocation;
    }

    public List<String> getKeyWords() {
        return keyWords;
    }

    public void setKeyWords(List<String> keyWords) {
        this.keyWords = keyWords;
    }

    public List<GitProjects> getProjects() {
        return projects;
    }

    public void setProjects(List<GitProjects> projects) {
        this.projects = projects;
    }
}
