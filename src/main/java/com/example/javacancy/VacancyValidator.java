package com.example.javacancy;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;

public class VacancyValidator implements org.springframework.validation.Validator {
    @Override
    public boolean supports(Class<?> aClass) {
        return false;
    }

    @Override
    public void validate(Object object, Errors errors) {
        ValidationUtils.rejectIfEmpty(errors, "jobTitle", "jobTitle.empty");
        ValidationUtils.rejectIfEmpty(errors, "jobTitle", "jobTitle.maxlength=20");
    }
}
