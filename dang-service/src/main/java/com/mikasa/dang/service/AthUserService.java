package com.mikasa.dang.service;

import com.mikasa.dang.entity.ath.AthUser;

/**
 * @description
 * @author: tianluhua
 * @date 2019/7/11 15:58
 */
public interface AthUserService {

    /**
     * 根据登录用户名获得用户
     * @param jobNumber
     * @return
     */
    AthUser getUserByJobNumber(String jobNumber);
}
