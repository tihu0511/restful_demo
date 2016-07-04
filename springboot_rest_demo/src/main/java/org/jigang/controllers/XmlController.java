package org.jigang.controllers;

import org.jigang.pojos.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by wujigang on 16/7/3.
 */
//@EnableAutoConfiguration
//@RestController
//@RequestMapping("/xml")
public class XmlController {
    @RequestMapping(value = "/user/v1/{id}")
    public User view(@PathVariable("id") Long id) {
        User user = new User();
        user.setId(id);
        user.setName("zhang");
        return user;
    }

    /*public static void main(String[] args) {
        SpringApplication.run(XmlController.class, args);
    }*/
}
