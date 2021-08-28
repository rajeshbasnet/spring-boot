package com.example.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {
    @Override
    public void initialize(CourseCode constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String code, ConstraintValidatorContext constraintValidatorContext) {

        String[] prefix  = {"TOP", "LUV"};
        boolean result = false;

        if(code != null) {
            for(String pre : prefix) {
                result = code.startsWith(pre);

                if(result) {
                    break;
                }
            }
        }

        return result;
    }
}
