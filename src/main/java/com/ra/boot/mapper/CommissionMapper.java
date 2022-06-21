package com.ra.boot.mapper;

import com.ra.boot.entity.CommissionEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CommissionMapper {

    public List getCommission();

    public int insertCommission(CommissionEntity commissionEntity);

}