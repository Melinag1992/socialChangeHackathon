package com.example.melg.recruit.models;

public class Recruiter extends Person{
    private String company;


    private String position;

    public Recruiter(String firstName, String lastName, String email, String company, String position ) {
        super(firstName, lastName, email);
        this.company = company;
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
