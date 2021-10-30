package com.collin.ci.badge.vo.req;

import lombok.Data;

import java.io.Serializable;

@Data
public class CreateProductReqVO implements Serializable {

    private String name;
    private String desc;

}
