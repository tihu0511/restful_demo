package org.jigang.controller;

import org.jigang.pojos.XmlInDto;
import org.jigang.pojos.XmlOutDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by wujigang on 16/7/3.
 */
@Controller
@RequestMapping("/v1")
public class TestController {
    @RequestMapping("/test")
    public @ResponseBody String test() {
        System.out.println("================= is coming.");
        return "Welcome";
    }

    @RequestMapping("/json/{username}")
    @ResponseBody
    public String testGetJson(@PathVariable("username") String username) {
        System.out.println(username);

        return "{\"aa\":123,\"bb\":\"" + username + "\"}";
    }
}
