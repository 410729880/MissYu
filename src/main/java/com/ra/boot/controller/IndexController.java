package com.ra.boot.controller;

import com.ra.boot.mapper.EmployeeMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@Controller
public class IndexController {

    @Autowired
    private EmployeeMapper employeeMapper;

    @RequestMapping("/test")
    public Map test(){

        Map map = new HashMap();

        List employee = employeeMapper.getEmployee();
        log.info("ssss"+employee);

        map.put("employeeEntity",employee);
//        employeeService.save(employee);

        return map;
    }

    @RequestMapping("/index")
    public String index(){
        return "index";
    }
}
