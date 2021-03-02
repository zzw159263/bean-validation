package com.self.example.beanvalidation.adapter1;

import com.self.example.beanvalidation.domain.bo.MemberBO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AuthHandler extends Handler {

    @Override
    public void doHandle(MemberBO member) {
        if (member.getRoleName().equals("管理员")){
            log.info("您不是管理员，没有操作权限");
            return;
        }
    }
}
