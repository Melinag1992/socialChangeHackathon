package com.example.melg.recruit.Recruit.models;

public class Recruiter extends Person{
    private String company;

    public Recruiter(String firstName, String lastName, String email, String company) {
        super(firstName, lastName, email);
        this.company = company;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
