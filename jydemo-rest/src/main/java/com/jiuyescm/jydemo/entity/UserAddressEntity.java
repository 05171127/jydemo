package com.jiuyescm.jydemo.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserAddressEntity implements Serializable {
    private static final long serialVersionUID = 2221007129183093595L;

    private Integer id;

    private Integer userId;

    private String address;
}
