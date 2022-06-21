package com.ra.boot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * 部门信息表
 * @TableName department
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class DepartmentEntity implements Serializable {
    /**
     * 部门编号
     */
    private Integer departmentId;

    /**
     * 部门名称
     */
    private String departmentName;

    /**
     * 部门描述
     */
    private String departmentContent;

}