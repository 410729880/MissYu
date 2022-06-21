package com.ra.boot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * 员工信息表
 * @TableName employee
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class EmployeeEntity implements Serializable {
    /**
     * 员工编号
     */
    private Integer employeeId;

    /**
     * 员工姓名
     */
    private String employeeName;

    /**
     * 员工年龄
     */
    private Integer employeeAge;

    /**
     * 部门
     */
    private String employeeDepartment;

    /**
     * 入职日期
     */
//    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GTM+8")
//    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date employeeHiredate;

    /**
     * 上级领导
     */
    private int employeeUpId;

    /**
     * 员工级别
     */
    private Integer employeeLevel;

    /**
     * 员工籍贯-省份
     */
    private String employeeProvince;
    /**
     * 员工籍贯-市
     */
    private String employeeCity;
    /**
     * 员工籍贯-地区
     */
    private String employeeCounty;

    /**
     * 手机号
     */
    private String employeePhone;

    /**
     * 紧急联系人
     */
    private String employeePhoneContact;

    /**
     * 员工头像
     */
    private String employeePic;

    /**
     * 备注信息
     */
    private String employeeContent;
}