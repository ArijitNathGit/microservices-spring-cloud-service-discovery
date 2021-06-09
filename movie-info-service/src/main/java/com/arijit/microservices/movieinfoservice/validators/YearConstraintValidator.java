package com.arijit.microservices.movieinfoservice.validators;

import java.time.LocalDate;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class YearConstraintValidator implements ConstraintValidator<YearVaidator, Integer>{
	@Override
    public boolean isValid(Integer value, ConstraintValidatorContext context) {
        return value < LocalDate.now().getYear();
    }
}
