package com.example.javacancy;

import java.util.ArrayList;
import java.util.List;

public class Vacancy {

    private String jobTitle;
    private String companyName;
    private Location location;
    private Experience experience;
    private Integer salary;
    private String jobDescription;
    private String jobId;
    private List<Application> applicants;

    public Vacancy(String jobTitle, String companyName, Location location, Experience experience, Integer salary, String jobDescription, String jobId) {
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.location = location;
        this.experience = experience;
        this.salary = salary;
        this.jobDescription = jobDescription;
        this.jobId = jobId; // Add random number
        applicants = new ArrayList<>();
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getCompanyName() {
        return companyName;
    }

    public Location getLocation() {
        return location;
    }

    public Experience getExperience() {
        return experience;
    }

    public Integer getSalary() {
        return salary;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public String getJobId(){
        return jobId;
    }
}
