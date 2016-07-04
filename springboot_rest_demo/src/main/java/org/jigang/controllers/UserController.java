package org.jigang.controllers;

import org.jigang.pojos.User;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wujigang on 16/7/3.
 */
//@RestController
//@RequestMapping("/user")
public class UserController {
    @RequestMapping(value = "/v1/{id}")
    public User view(@PathVariable("id") Long id) {

        User user = new User();
        user.setId(id);
        user.setName("zhang");
        return user;
    }

    @RequestMapping(value = "/v2/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_XML_VALUE)
    public User view2(@PathVariable("id") Long id) {

        User user = new User();
        user.setId(id);
        user.setName("zhang");
        return user;
    }
}
