package com.ra.boot.controller;

import com.ra.boot.entity.CustomerProductEntity;
import com.ra.boot.mapper.CustomerProductMapper;
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
public class CustomerProductTest {

    @Autowired
    public CustomerProductMapper customerProductMapper;

    @Test
    public void getEntity(){

        List customerProduct = customerProductMapper.getCustomerProduct();

        log.info("查询数据中"+customerProduct);
    }

    @Test
    public void saveEntity(){

        CustomerProductEntity customerProductEntity = new CustomerProductEntity();
        customerProductEntity.setProductId(2);
        customerProductEntity.setProductNum(9);

        int num = customerProductMapper.insertCustomerProduct(customerProductEntity);

        log.info("插入数据中"+num);
    }
}
