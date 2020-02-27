package com.example.javacancy;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.concurrent.ThreadLocalRandom;

@Entity
public class Application {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String firstName;
    String lastName;
    String email;
    String phoneNumber;
    String applicationText;
    String applicationId;

    public Application() {
    }

    public Application(String firstName, String lastName, String email, String phoneNumber, String applicationText) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.applicationText = applicationText;

        // Add random application ID
        ThreadLocalRandom random = ThreadLocalRandom.current();
        this.applicationId = String.valueOf(random.nextInt(100000,499999));
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
