package com.mikasa.dang.controller;

import com.mikasa.dang.ath.AthUserDto;
import com.mikasa.dang.common.DangConstants;
import com.mikasa.dang.common.InvokeResult;
import com.mikasa.dang.service.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
@RequestMapping(value = "testController")
@SuppressWarnings("All")
public class TestController {

    private static final Logger logger = LoggerFactory.getLogger(TestController.class);

    @Autowired
    private TestService testService;

    @RequestMapping(value = "test",method = RequestMethod.GET)
    @ResponseBody
   public InvokeResult<AthUserDto> test(){
        logger.info("test ----");
        AthUserDto athUserDto=new AthUserDto();
        InvokeResult invokeResult=new InvokeResult();
        invokeResult.setData(athUserDto);
        invokeResult.setStatus(DangConstants.SUCCESS_STATUS);
        invokeResult.setMessage(DangConstants.SUCCESS_LOGIN);
        testService.test();
        return invokeResult;
   }

}
