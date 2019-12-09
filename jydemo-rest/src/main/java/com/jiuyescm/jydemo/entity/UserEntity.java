package com.jiuyescm.jydemo.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserEntity implements Serializable {
    private static final long serialVersionUID = 3061145571369886417L;

    private Integer id;

    private String username;
}
