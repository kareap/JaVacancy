package com.example.javacancy;

public class Vacancy {

    private String jobTitle;
    private String companyName;
    private Location location;
    private Experience experience;
    private int salary;
    private String jobDescription;

    public Vacancy(String jobTitle, String companyName, Location location, Experience experience, int salary, String jobDescription) {
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.location = location;
        this.experience = experience;
        this.salary = salary;
        this.jobDescription = jobDescription;
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

    public int getSalary() {
        return salary;
    }

    public String getJobDescription() {
        return jobDescription;
    }
}
