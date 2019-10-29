package com.leon.controller;

import com.leon.pojo.Account;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public Account test(@RequestParam(value = "name",defaultValue = "Leon") String name, @RequestParam(value = "age",defaultValue = "20")int age){
        return new Account((int)age,name);
    }

}
