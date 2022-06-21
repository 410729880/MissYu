package com.ra.boot.mapper;

import com.ra.boot.entity.EmployeeEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EmployeeMapper {

    public List<EmployeeEntity> getEmployee();

    public int addEmployee(EmployeeEntity employeeEntity);

}