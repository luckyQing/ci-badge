package com.collin.ci.badge.vo.resp;

import lombok.Data;

import java.io.Serializable;

@Data
public class ProductRespVO implements Serializable {

    private Long id;
    private String name;
    private String desc;

}