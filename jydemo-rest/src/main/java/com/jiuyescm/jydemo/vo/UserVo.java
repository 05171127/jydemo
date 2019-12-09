package com.jiuyescm.jydemo.vo;

import lombok.Data;

import java.io.Serializable;


@Data
public class UserVo implements Serializable {
    private static final long serialVersionUID = 6137872716085227538L;
    private Integer id;

    private String username;

    private String address;
}
