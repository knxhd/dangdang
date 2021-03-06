package com.mikasa.dang.controller.ath;

import com.mikasa.dang.common.DangConstants;
import com.mikasa.dang.common.InvokeResult;
import com.mikasa.dang.entity.ath.AthUserDto;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName LoginController
 * @description
 * @author: tianluhua
 * @date 2019/6/28 17:02
 */
@Controller
@RequestMapping(value = "loginController")
public class LoginController {

    private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

    @RequestMapping(value = "login",method = RequestMethod.POST)
    @ResponseBody
    public InvokeResult<AthUserDto> login(String  userName, String passWord, String rememberMe, HttpServletRequest request){
        logger.info("{}登录中。。。。",userName);
        AthUserDto athUserDto1=new AthUserDto();
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token=new UsernamePasswordToken();
        token.setUsername(userName);
        token.setPassword(passWord.toCharArray());
        subject.login(token);
        InvokeResult<AthUserDto> invokeResult=new InvokeResult<>();
        invokeResult.setData(athUserDto1);
        invokeResult.setStatus(DangConstants.SUCCESS_STATUS);
        invokeResult.setMessage(DangConstants.SUCCESS_LOGIN);
        return invokeResult;
    }
}
