package com.example.melg.recruit.models;

public class JobPosting extends Recruiter {

    private String post_title;
    private String posted_date; //change to posted_date

    private String job_description; //change to job_description
    private String position_keywords;
    private String seeking_role; // change to seeking seeking_role
    private String salary; // change to salary


    public JobPosting(String firstName, String lastName, String email, String company, String Position, String date_posted, String job_description, String position_keywords, String seeking_role, String salary, String post_title) {
        super(firstName, lastName, email, company, Position);
        this.posted_date = date_posted;
        this.job_description = job_description;
        this.position_keywords = position_keywords;
        this.seeking_role = seeking_role;
        this.post_title = post_title;
        this.salary = salary;
    }

    public String getPost_title() {
        return post_title;
    }

    public void setPost_title(String post_title) {
        this.post_title = post_title;
    }

    public String getPosted_date() {
        return posted_date;
    }

    public void setPosted_date(String posted_date) {
        this.posted_date = posted_date;
    }
    public String getDate_posted() {
        return posted_date;
    }

    public void setDate_posted(String date_posted) {
        this.posted_date = date_posted;
    }

    public String getJob_description() {
        return job_description;
    }

    public void setJob_description(String job_description) {
        this.job_description = job_description;
    }

    public String getPosition_keywords() {
        return position_keywords;
    }

    public void setPosition_keywords(String position_keywords) {
        this.position_keywords = position_keywords;
    }

    public String getSeeking_role() {
        return seeking_role;
    }

    public void setSeeking_role(String seeking_role) {
        this.seeking_role = seeking_role;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
}
