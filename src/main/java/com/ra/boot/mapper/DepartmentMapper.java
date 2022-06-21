package com.ra.boot.mapper;

import com.ra.boot.entity.DepartmentEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DepartmentMapper {

    public List getDepartment();

    public int insertDepartment(DepartmentEntity departmentEntity);

}