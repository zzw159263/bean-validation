package com.self.example.beanvalidation.domain.request;

import com.self.example.beanvalidation.common.request.BaseRequest;
import com.self.example.beanvalidation.domain.po.EmployeePO;

import javax.validation.Valid;

public class EmployReq extends BaseRequest {
    /**
     * 部门id
     */
    private Long departmentId;
    /**
     * 是否主管
     */
    private Integer isManager;
    /**
     * 员工信息
     */
    @Valid
    private EmployeePO employeeInfo;
}
