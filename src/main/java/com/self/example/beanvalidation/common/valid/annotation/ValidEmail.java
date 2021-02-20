package com.self.example.beanvalidation.common.valid.annotation;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.lang.annotation.*;

@NotBlank
@Size
@Email
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = {})
@Documented
public @interface ValidEmail {
    String message() default "邮箱格式有误";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
