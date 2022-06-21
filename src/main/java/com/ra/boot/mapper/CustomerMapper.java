package com.ra.boot.mapper;

import com.ra.boot.entity.CustomerEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CustomerMapper {

    public List getCustomer();

    public int insertCustomer(CustomerEntity customerEntity);

}