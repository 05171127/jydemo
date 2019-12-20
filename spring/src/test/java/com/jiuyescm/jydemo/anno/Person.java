package com.jiuyescm.jydemo.anno;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Info(isDelete = true)
public class Person {
    private String name;
    private int age;
    private boolean isDelete;
}
