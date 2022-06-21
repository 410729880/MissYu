package com.ra.boot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * 顾客操作明细表
 * @TableName cusume
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CusumeEntity implements Serializable {
    /**
     * 顾客操作明细编号
     */
    private Integer cusumeId;

    /**
     * 操作时间
     */
    private Date cusumeDate;

    /**
     * 操作员工编号
     */
    private Integer employeeId;

    /**
     * 操作员工类型
     */
    private Integer employeeType;

    /**
     * 操作产品编号
     */
    private Integer productId;

    /**
     * 操作次数
     */
    private Integer cusumeNum;

    /**
     * 拍照对比图id
     */
    private String cusumePicsId;

}