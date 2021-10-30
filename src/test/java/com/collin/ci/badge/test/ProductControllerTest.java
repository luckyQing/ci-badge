package com.collin.ci.badge.test;

import com.collin.ci.badge.controller.ProductController;
import com.collin.ci.badge.vo.req.CreateProductReqVO;
import com.collin.ci.badge.vo.resp.ProductRespVO;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class ProductControllerTest {

    @Autowired
    private ProductController productController;

    @Test
    public void testQuery() {
        ProductRespVO respVO = productController.query(100L);
        Assertions.assertThat(respVO).isNotNull();
    }

    @Test
    public void testCreate() {
        CreateProductReqVO reqVO = new CreateProductReqVO();
        reqVO.setName("mobile");
        reqVO.setDesc("iphone");
        ProductRespVO respVO = productController.create(reqVO);
        Assertions.assertThat(respVO).isNotNull();
    }

}