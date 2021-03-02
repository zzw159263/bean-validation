
package com.self.example.beanvalidation.controller;

import com.self.example.beanvalidation.common.response.Response;
import com.self.example.beanvalidation.common.valid.InsertChecks;
import com.self.example.beanvalidation.domain.po.DepartmentPO;
import com.self.example.beanvalidation.domain.po.EmployeePO;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.validator.constraints.URL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Min;

@RestController
@RequestMapping("/depts")
@Slf4j
@Validated
public class  DepartmentController {

    @Autowired
    private ApplicationContext context;

    @GetMapping("/all")
    public Response allDepartments() {
        context.getBean("loginService");
        log.info("查询所有部门");
        return null;
    }

    @GetMapping("/{departmentId}/employees")
    public Response selectEmployeesByDept(@Min(value = 1)
                                          @PathVariable(value = "departmentId") Long departmentId) {
        log.info("查询部门下的所有员工");
        return null;
    }

    @PostMapping("")
    public Response insertDept(@Validated(value = {InsertChecks.class})
                               @RequestBody DepartmentPO departmentInfo) {
        log.info(departmentInfo.toString());
        log.info("新增部门");
        return null;
    }

    @PostMapping("/{departmentId}/employee")
    public Response insertEmployee(@PathVariable(value = "departmentId") Long departmentId,
                                   @RequestBody EmployeePO employeeInfo) {
        return null;
    }

    @PutMapping("/{departmentId}")
    public Response updateDept(@PathVariable(value = "departmentId") Long departmentId,
                               @RequestBody DepartmentPO departmentInfo) {
        return null;
    }

    /**
     * 修改员工所属部门
     *
     * @param departmentId 部门id
     * @param employeeId   员工id
     */
    @PutMapping("/{departmentId}/employee/{employeeId}")
    public Response updateEmployeeDepartment(@PathVariable(value = "departmentId") Long departmentId,
                                             @PathVariable(value = "employeeId") Long employeeId) {
        return null;
    }

    @DeleteMapping("/{departmentId}")
    public Response deleteDept(@PathVariable(value = "departmentId") Long departmentId) {
        return null;
    }

}
