package com.mikasa.dang.controller;

import com.mikasa.dang.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName TestController
 * @description
 * @author: tianluhua
 * @date 2019/6/25 9:05
 */
@Controller
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping(value = "test",method = RequestMethod.GET)
    @ResponseBody
   public void test(){
        System.out.println("test ----");
       testService.test();
   }

}
