package com.self.example.beanvalidation.adapter1;

import com.self.example.beanvalidation.domain.bo.MemberBO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ValidateHandler extends Handler {

    @Override
    public void doHandle(MemberBO member) {
        if (member.getLoginName() != null && member.getLoginPass() != null){
            log.info("用户名密码校验通过，向下执行");
            chain.doHandle(member);
        }

    }
}
