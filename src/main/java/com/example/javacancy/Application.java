package com.example.javacancy;

public class Application {
    String firstName;
    String lastName;
    String email;
    String phoneNumber;
    String applicationText;
    String applicationId;

    public Application(String firstName, String lastName, String email, String phoneNumber, String applicationText, String applicationId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.applicationText = applicationText;
        this.applicationId = applicationId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getApplicationText() {
        return applicationText;
    }
}
