package com.ra.boot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * 员工佣金表
 * @TableName Commission
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CommissionEntity implements Serializable {
    /**
     * 佣金编号
     */
    private Integer commissionId;

    /**
     * 员工编号
     */
    private Integer employeeId;

    /**
     * 产品编号
     */
    private Integer productId;

    /**
     * 操作次数
     */
    private Integer cusumeNum;

    /**
     * 佣金比例
     */
    private float rate;

    /**
     * 佣金
     */
    private float commission;

}