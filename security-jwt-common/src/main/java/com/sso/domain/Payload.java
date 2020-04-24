package com.sso.domain;

import lombok.Data;

import java.util.Date;

/**
 * @description:
 * @author:
 * @create: 2019-12-03 10:28
 */
@Data
public class Payload <T>{
    private String id;
    private T userInfo;
    private Date expiration;
}

