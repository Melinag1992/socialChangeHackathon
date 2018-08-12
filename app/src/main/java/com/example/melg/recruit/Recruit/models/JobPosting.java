package com.example.melg.recruit.Recruit.models;

import com.example.melg.recruit.models.Recruiter;

public class JobPosting extends Recruiter {

    private String date_posted;
    private String description;
    private String position_keywords;
    private String role;
    private String salary_range;

    public JobPosting(String firstName, String lastName, String email, String company, String Position, String date_posted, String description, String position_keywords, String role, String salary_range) {
        super(firstName, lastName, email, company, Position);
        this.date_posted = date_posted;
        this.description = description;
        this.position_keywords = position_keywords;
        this.role = role;
        this.salary_range = salary_range;
    }

    public String getDate_posted() {
        return date_posted;
    }

    public void setDate_posted(String date_posted) {
        this.date_posted = date_posted;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPosition_keywords() {
        return position_keywords;
    }

    public void setPosition_keywords(String position_keywords) {
        this.position_keywords = position_keywords;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getSalary_range() {
        return salary_range;
    }

    public void setSalary_range(String salary_range) {
        this.salary_range = salary_range;
    }
}
