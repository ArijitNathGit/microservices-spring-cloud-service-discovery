package com.arijit.microservices.movieinfoservice.validators;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = YearConstraintValidator.class)
public @interface YearVaidator {
	String message() default "Invalid Year!";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };
}
