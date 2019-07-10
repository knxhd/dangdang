package com.mikasa.dang.common;

import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName InvokeResult
 * @description
 * @author: tianluhua
 * @date 2019/7/1 10:47
 */
@Data
public class InvokeResult<T>  implements Serializable {

    public static final  long serialVersionUID =4608423902229211494L;

    /**
     * 结果集状态
     */
    private Integer status;


    /**
     * 提示消息
     */
    private String message;

    /**
     * 数据
     */
    private T data;

}
