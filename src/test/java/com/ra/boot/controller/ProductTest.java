package com.ra.boot.controller;

import com.ra.boot.entity.ProductEntity;
import com.ra.boot.mapper.ProductMapper;
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
public class ProductTest {

    @Autowired
    public ProductMapper productMapper;

    @Test
    public void getEntity(){

        List product = productMapper.getProduct();

        log.info("查询数据中"+product);
    }

    @Test
    public void saveEntity(){

        ProductEntity productEntity = new ProductEntity();
        productEntity.setProductName("面膜");
        productEntity.setProductPrice(100.3f);
        productEntity.setProductPic("");
        productEntity.setProductContent("产品说明1");

        int num = productMapper.insertProduct(productEntity);

        log.info("插入数据中"+num);
    }
}
