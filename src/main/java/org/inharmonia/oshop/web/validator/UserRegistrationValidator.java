package org.inharmonia.oshop.web.validator;

import org.inharmonia.oshop.web.domain.UserRegistration;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class UserRegistrationValidator implements Validator {


    @Override
    public boolean supports(Class<?> clazz) {
        return clazz.equals(UserRegistration.class);
    }

    @Override
    public void validate(Object target, Errors errors) {
        UserRegistration ur = (UserRegistration) target;
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "user.fullName", "", "Full name cannot be empty");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "user.email", "", "Email cannot be empty");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "user.password", "", "Password cannot be empty");
        if(ur.getUser().getPassword().length() < 6){
            errors.rejectValue("user.password", "", "Password must 6 or more characters long");
        }
        if(!ur.getPasswordConfirmation().equals(ur.getUser().getPassword())){
            errors.rejectValue("passwordConfirmation", "", "Password is different");
        }
        if(!ValidationHelper.isValidEmail(ur.getUser().getEmail())){
            errors.rejectValue("user.email", "", "Email is invalid");
        }
        if(!ur.getEmailConfirmation().equals(ur.getUser().getEmail())){
            errors.rejectValue("emailConfirmation", "", "Email confirmation is different");
        }
    }
}
