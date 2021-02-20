package com.self.example.beanvalidation.common.valid.validator;

import com.self.example.beanvalidation.common.valid.annotation.ValidTel;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Pattern;

public class TelValidator implements ConstraintValidator<ValidTel, String> {

    @Override
    public void initialize(ValidTel constraintAnnotation) {
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value == null){
            return true;
        }

        boolean matches = Pattern.matches("^[0][1-9]{2,3}-[0-9]{5,10}$", value);
        if (!matches){
            if (context.getDefaultConstraintMessageTemplate().isEmpty()){
                context.disableDefaultConstraintViolation();
                context.buildConstraintViolationWithTemplate("ValidTel.message")
                       .addConstraintViolation();
            }
            return false;
        }
        //校验座机号格式
        return true;
    }
}
