package com.mikasa.dang.controller.ath;

import com.mikasa.dang.ath.AthUserDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName LoginController
 * @description
 * @author: tianluhua
 * @date 2019/6/28 17:02
 */
@Controller
@RequestMapping(value = "loginController")
public class LoginController {

    @RequestMapping(value = "login",method = RequestMethod.POST)
    @ResponseBody
    public void  login(AthUserDto athUserDto){
        System.out.println(athUserDto.toString()+"登录中。。。。");
    }
}
