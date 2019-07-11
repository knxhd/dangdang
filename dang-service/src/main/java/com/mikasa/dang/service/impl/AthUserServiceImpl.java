package com.mikasa.dang.service.impl;

import com.mikasa.dang.dao.ath.AthUserDao;
import com.mikasa.dang.entity.ath.AthUser;
import com.mikasa.dang.service.AthUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName AthUserServiceImpl
 * @description
 * @author: tianluhua
 * @date 2019/7/11 16:03
 */
@Service
public class AthUserServiceImpl implements AthUserService {

    private final AthUserDao athUserDao;

    @Autowired
    public AthUserServiceImpl(AthUserDao athUserDao) {
        this.athUserDao = athUserDao;
    }

    /**
     * 根据登录用户获得用户全部信息
     *
     * @param jobNumber
     * @return AthUser
     * @date 2019/7/11 16:04
     */
    @Override
    public AthUser getUserByJobNumber(String jobNumber) {
        return athUserDao.getUserByJobNumber(jobNumber);
    }
}
