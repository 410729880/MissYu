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
public class CustomerProductEntity implements Serializable {
    /**
     * 顾客产品信息编号
     */
    private Integer customerProductId;

    /**
     * 产品编号
     */
    private Integer productId;

    /**
     * 产品剩余数量
     */
    private Integer productNum;

}