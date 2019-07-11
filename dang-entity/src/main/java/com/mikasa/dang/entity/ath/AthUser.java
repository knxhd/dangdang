package com.mikasa.dang.entity.ath;

import lombok.Data;

/**
 * @ClassName AthUser
 * @description
 * @author: tianluhua
 * @date 2019/7/11 16:00
 */
@Data
public class AthUser {

    private String userId;

    private String userName;

    private String passWord;

    private String jobNumber;

    /**
     *  用户是否可用，不可用则表示锁定账户，1：不可用，0：可用
     */
    private Integer isEnabled;

}
