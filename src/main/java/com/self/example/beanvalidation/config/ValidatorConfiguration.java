package com.self.example.beanvalidation.config;

import org.hibernate.validator.HibernateValidator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.validation.Validation;
import javax.validation.ValidatorFactory;
import javax.validation.Validator;

/**
 * 添加以下配置
 * 如果有参数未通过校验立即抛出异常
 * 默认全部有注解标识的字段均校验
 */
@Configuration
public class ValidatorConfiguration {

//    @Bean
//    public Validator validator(){
//        ValidatorFactory validatorFactory = Validation.byProvider(HibernateValidator.class)
//                .configure()
//                .addProperty( "hibernate.validator.fail_fast", "true" )
//                .buildValidatorFactory();
//        Validator validator = validatorFactory.getValidator();
//
//        return validator;
//    }
}
