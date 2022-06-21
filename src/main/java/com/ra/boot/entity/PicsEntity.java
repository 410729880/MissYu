package com.ra.boot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * 图片组信息表
 * @TableName pics
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PicsEntity implements Serializable {
    /**
     * 图片组编号
     */
    private Integer picsId;

    /**
     * 图片
     */
    private String pic;

}