package com.example.javacancy;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@Entity
public class Vacancy implements Comparable<Vacancy> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String jobTitle;
    private String companyName;
    private Location location;
    private Experience experience;
    private Integer salary;
    private String jobDescription;
    private String jobId;
    private int searchRelevance;

    public Vacancy() {
    }

    public Vacancy(String jobTitle, String companyName, Location location, Experience experience, Integer salary, String jobDescription) {
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.location = location;
        this.experience = experience;
        this.salary = salary;
        this.jobDescription = jobDescription;
        this.searchRelevance = 0;

        // Add random job ID
        ThreadLocalRandom random = ThreadLocalRandom.current();
        this.jobId = String.valueOf(random.nextInt(500000, 999999));

        //applicants = new ArrayList<>();
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

    public String getJobId() {
        return jobId;
    }

    public void setSearchRelevance(int searchRelevance) {
        this.searchRelevance = searchRelevance;
    }

    public int getSearchRelevance() {
        return searchRelevance;
    }

    @Override
    public int compareTo(Vacancy v) {
        return Integer.compare(v.getSearchRelevance(), searchRelevance);
    }
}
