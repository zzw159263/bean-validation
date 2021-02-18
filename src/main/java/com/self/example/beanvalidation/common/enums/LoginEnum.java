package com.self.example.beanvalidation.common.enums;

public enum LoginEnum {
    H5(1, "H5登录"),
    MINI_APP(2, "小程序"),
    APP(3, "客户端"),
    SYSTEM(4, "web端")
    ;
    private int type;
    private String desc;

    LoginEnum(int type, String desc) {
        this.type = type;
        this.desc = desc;
    }

    public int getType() {
        return type;
    }

    public String getDesc() {
        return desc;
    }
}
