package com.self.example.beanvalidation.domain.valid;

import javax.validation.GroupSequence;

/**
 * 校验顺序是UsernameChecks -> PasswordChecks
 */
@GroupSequence({UsernameChecks.class, PasswordChecks.class})
public class LoginChecks {
}
