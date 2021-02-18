package com.self.example.beanvalidation.domain.po;

import com.self.example.beanvalidation.common.po.BasePO;
import com.self.example.beanvalidation.common.valid.InsertChecks;
import com.self.example.beanvalidation.common.valid.UpdateChecks;
import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class DepartmentPO extends BasePO {
    /**
     * 主键
     */
    @NotBlank(groups = UpdateChecks.class)
    private Long id;
    /**
     * 部门名称
     */
    @NotBlank(groups = InsertChecks.class)
    private String name;
    /**
     * 父级部门
     * 校验逻辑是:
     *  新增时必须不为空且必须大于等于0
     *  更新时为空不更新，不为空校验是否大于0
     */
    @NotNull(groups = {InsertChecks.class})
    @Min(value = 0, groups = InsertChecks.class)
    private Integer parentId;
    /**
     * 级别
     */
    private Integer level;
    /**
     * 级别标识树
     */
    private String pathTree;

}
