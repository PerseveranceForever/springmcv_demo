package com.example.springboot.controller;

import com.example.springboot.vo.DateVO;
import com.example.springboot.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author zhouguanya
 * @Date 2018/2/12
 * @Description
 */
@RestController
@RequestMapping("/users")
public class MyRestController {

    @RequestMapping(value="/{userId}", method= RequestMethod.GET)
    public User getUser(@PathVariable Long userId) {
        //假设此处进行了DAO操作
        User user = new User();
        user.setUserId(userId);
        user.setUserName("张三");
        user.setPassword("123");
        return user;
    }

    @RequestMapping("formatedate")
    public Date getFormatDate() {
        return new Date();
    }

    @RequestMapping(value = "str2date")
    public void getFormatDate(@RequestBody DateVO dateVO) {
        System.out.println(dateVO);
    }

    @RequestMapping("/welcome/{name}")
    public ModelAndView demo(@PathVariable String name) {
        Map<String, Object> objectMap = new HashMap<>(1);
        objectMap.put("name", name);
        return new ModelAndView("welcome");
    }

    @RequestMapping("exception")
    public void exceptionDemo(){
        throw new RuntimeException("An uncaught Exception happened");
    }
}
