package com.mikasa.dang.shiro;

import com.mikasa.dang.entity.ath.AthUser;
import com.mikasa.dang.service.AthUserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @ClassName MyRealm
 * @description
 * @author: tianluhua
 * @date 2019/7/3 11:26
 */
public class MyRealm extends AuthorizingRealm {

    @Autowired
    private AthUserService athUserService;

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        String jobNumber = (String) authenticationToken.getPrincipal();
        AthUser athUser = athUserService.getUserByJobNumber(jobNumber);
        if (athUser == null) {
            throw new UnknownAccountException();
        }
        if (athUser.getIsEnabled() == 1) {
            throw new LockedAccountException();
        }
        return new SimpleAuthenticationInfo(athUser.getJobNumber(),athUser.getPassWord(),getName());
    }

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }
}
