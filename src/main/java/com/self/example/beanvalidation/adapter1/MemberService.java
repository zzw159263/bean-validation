package com.self.example.beanvalidation.adapter1;

import com.self.example.beanvalidation.domain.bo.MemberBO;

public class MemberService {

    public void login(String loginName, String loginPass) {
        Handler.Builder builder = new Handler.Builder();
        builder.addHeader(new ValidateHandler())
                .addHeader(new LoginHandler())
                .addHeader(new AuthHandler());

        builder.build().doHandle(new MemberBO(loginName, loginPass));
    }

    public static void main(String[] args) {
        new MemberService().login("aaa", null);
    }
}
