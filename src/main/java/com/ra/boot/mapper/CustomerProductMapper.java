package com.ra.boot.mapper;

import com.ra.boot.entity.CustomerProductEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CustomerProductMapper {

    public List getCustomerProduct();

    public int insertCustomerProduct(CustomerProductEntity customerProductEntity);

}