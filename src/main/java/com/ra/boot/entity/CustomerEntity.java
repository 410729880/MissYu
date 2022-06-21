package com.ra.boot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * 顾客信息表
 * @TableName Commission
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CustomerEntity implements Serializable {
    /**
     * 顾客编号
     */
    private Integer customerId;

    /**
     * 顾客姓名
     */
    private String customerName;

    /**
     * 年龄
     */
    private Integer customerAge;

    /**
     * 性别
     */
    private Integer customerSex;

    /**
     * 手机号
     */
    private String customerPhone;

    /**
     * 地址
     */
    private String customerAddress;

}