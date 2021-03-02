package com.self.example.beanvalidation.adapter1;

import com.self.example.beanvalidation.domain.bo.MemberBO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LoginHandler extends Handler {

    @Override
    public void doHandle(MemberBO member) {
        log.info("登陆成功！");
        member.setRoleName("管理员");
        chain.doHandle(member);
    }
}
