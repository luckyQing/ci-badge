package com.collin.ci.badge.controller;

import com.collin.ci.badge.service.ProductService;
import com.collin.ci.badge.vo.req.CreateProductReqVO;
import com.collin.ci.badge.vo.resp.ProductRespVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Validated
@RestController
@RequestMapping("product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public ProductRespVO query(@NotNull Long id) {
        return productService.query(id);
    }

    @PostMapping
    public ProductRespVO create(@RequestBody @Valid CreateProductReqVO reqVO) {
        return productService.create(reqVO);
    }

}