package com.mikasa.dang.service.impl;

import com.mikasa.dang.dao.TestDao;
import com.mikasa.dang.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName TestServiceImpl
 * @description
 * @author: tianluhua
 * @date 2019/6/25 9:10
 */
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestDao testDao;

    public String test() {
        System.out.println("server层进入====");
        return testDao.test();
    }
}
