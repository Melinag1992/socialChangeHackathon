package com.example.melg.recruit.models;

import java.util.List;

public class User extends Person{
    private String  git;
    private String role;
    private String resumeLocation;
    private List<String> keywords;
    private List<GitProjects> projects;
    private String language;
    private boolean matched;



    public User(String firstName, String lastName, String email, String git, String role, String resumeLocation, List<String> keywords, List<GitProjects> projects, String language, boolean matched) {
        super(firstName, lastName, email);
        this.git = git;
        this.role = role;
        this.resumeLocation = resumeLocation;
        this.keywords = keywords;
        this.projects = projects;
        this.language = language;
        this.matched = matched;
    }


    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public boolean isMatched() {
        return matched;
    }

    public void setMatched(boolean matched) {
        this.matched = matched;
    }
    public String getGit() {
        return git;
    }

    public void setGit(String git) {
        this.git = git;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getResumeLocation() {
        return resumeLocation;
    }

    public void setResumeLocation(String resumeLocation) {
        this.resumeLocation = resumeLocation;
    }

    public List<String> getKeywords() {
        return keywords;
    }

    public void setKeywords(List<String> keywords) {
        this.keywords = keywords;
    }

    public List<GitProjects> getProjects() {
        return projects;
    }

    public void setProjects(List<GitProjects> projects) {
        this.projects = projects;
    }
}
