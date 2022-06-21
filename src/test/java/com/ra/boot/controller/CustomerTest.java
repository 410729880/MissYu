package com.ra.boot.controller;

import com.ra.boot.entity.CustomerEntity;
import com.ra.boot.mapper.CustomerMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerTest {

    @Autowired
    public CustomerMapper customerMapper;

    @Test
    public void getEntity(){

        List customer = customerMapper.getCustomer();

        log.info("查询数据中"+customer);
    }

    @Test
    public void saveEntity(){

        CustomerEntity customerEntity = new CustomerEntity();
        customerEntity.setCustomerName("zhangsan");
        customerEntity.setCustomerAge(18);
        customerEntity.setCustomerSex(0);
        customerEntity.setCustomerPhone("1888888888");
        customerEntity.setCustomerAddress("上海青浦");

        int num = customerMapper.insertCustomer(customerEntity);

        log.info("插入数据中"+num);
    }
}
