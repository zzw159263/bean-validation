package com.self.example.beanvalidation.common.valid.annotation;

import com.self.example.beanvalidation.common.valid.validator.TelValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.ANNOTATION_TYPE, ElementType.TYPE_USE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = TelValidator.class)
public @interface ValidTel {
    String message() default "座机号校验失败";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    String value();
}
