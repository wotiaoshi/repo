package com.uniform.datacollection.util;

import lombok.Data;

/**
 * @author Zyx
 * @date 2020/5/25 9:28
 */
@Data
public class Result {
    private String code;
    private String msg;
    private Object data;
}
