package com.self.example.beanvalidation.domain.po;

import com.self.example.beanvalidation.common.po.BasePO;
import lombok.Data;

import java.util.Date;

@Data
public class EmployeePO extends BasePO {
    /**
     * 主键
     */
    private Long id;
    /**
     * 姓名
     */
    private String name;
    /**
     * 头像
     */
    private String avatar;
    /**
     * 别名
     */
    private String alias;
    /**
     * 账号
     */
    private String account;
    /**
     * 性别
     */
    private Integer sex;
    /**
     * 手机号
     */
    private Integer phone;
    /**
     * 座机号
     */
    private String tel;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 地址
     */
    private String address;
    /**
     * 生日
     */
    private Date birthday;
}
