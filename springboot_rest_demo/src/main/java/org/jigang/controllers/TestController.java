package org.jigang.controllers;

import com.alibaba.dubbo.config.annotation.Reference;
import org.jigang.dao.TestDao;
import org.jigang.ws.ITest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by wujigang on 16/7/4.
 */
@Controller
public class TestController {

    @Autowired
    private TestDao testDao;

//    @Reference(version = "1.0.0", check = false)
    private ITest test;

    @RequestMapping("/test")
    @ResponseBody
    public String test() {
        int cnt = testDao.countTest();
        System.out.println(cnt);

        test.sayHello();

        return cnt + "sssss";
    }
}
