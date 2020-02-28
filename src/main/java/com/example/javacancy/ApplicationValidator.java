package com.example.javacancy;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;

public class ApplicationValidator implements org.springframework.validation.Validator {
    @Override
    public boolean supports(Class<?> aClass) {
        return Application.class.equals(aClass);
    }

    @Override
    public void validate(Object object, Errors errors) {
        ValidationUtils.rejectIfEmpty(errors, "jobTitle", "text.empty");
        ValidationUtils.rejectIfEmpty(errors, "companyName", "companyName.empty");
        ValidationUtils.rejectIfEmpty(errors, "location", "location.empty");
        ValidationUtils.rejectIfEmpty(errors, "experience", "experience.empty");
        ValidationUtils.rejectIfEmpty(errors, "salary", "salary.empty");
        ValidationUtils.rejectIfEmpty(errors, "jobDescription", "jobDescription.empty");

        //ValidationUtils.rejectValue(errors, "jobDescription", "jobDescription.empty");
    }
}