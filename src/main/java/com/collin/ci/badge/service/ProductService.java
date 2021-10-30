package com.collin.ci.badge.service;

import com.collin.ci.badge.vo.req.CreateProductReqVO;
import com.collin.ci.badge.vo.resp.ProductRespVO;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    public ProductRespVO query(Long id) {
        ProductRespVO respVO = new ProductRespVO();
        respVO.setId(id);
        respVO.setName("mobile");
        respVO.setDesc("iphone");
        return respVO;
    }

    public ProductRespVO create(CreateProductReqVO reqVO) {
        ProductRespVO respVO = new ProductRespVO();
        respVO.setId(100L);
        respVO.setName("mobile");
        respVO.setDesc("iphone");
        return respVO;
    }

}