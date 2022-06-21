package com.ra.boot.mapper;

import com.ra.boot.entity.ProductEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductMapper {

    public List getProduct();

    public int insertProduct(ProductEntity productEntity);

}