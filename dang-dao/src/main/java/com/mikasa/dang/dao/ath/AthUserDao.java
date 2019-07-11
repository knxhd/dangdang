package com.mikasa.dang.dao.ath;

import com.mikasa.dang.entity.ath.AthUser;
import org.apache.ibatis.annotations.Param;

/**
 * @description
 * @author: tianluhua
 * @date 2019/7/11 16:40
 */
public interface AthUserDao {

    /**
     * 根据用户登录名获得用户的全部信息
     * @param jobNumber
     * @return
     */
    AthUser getUserByJobNumber(@Param("jobNumber") String jobNumber);
}
