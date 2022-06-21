package com.ra.boot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * 员工信息表
 * @TableName product
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ProductEntity implements Serializable {
    /**
     * 产品编号
     */
    private Integer productId;

    /**
     * 产品名称
     */
    private String productName;

    /**
     * 产品价格
     */
    private Float productPrice;

    /**
     * 产品图片
     */
    private String productPic;

    /**
     * 产品说明
     */
    private String productContent;

}