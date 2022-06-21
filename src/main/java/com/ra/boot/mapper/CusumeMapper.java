package com.ra.boot.mapper;

import com.ra.boot.entity.CusumeEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CusumeMapper {

    public List getCusume();

    public int insertCusume(CusumeEntity cusumeEntity);

}