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
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "firstName", "firstName.empty");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "lastName", "lastName.empty");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "email.empty");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "phoneNumber", "phoneNumber.empty");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "applicationText", "applicationText.empty");

    }
}
