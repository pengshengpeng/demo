package com.example.demo.controller;

import com.example.demo.comm.MyException;
import com.example.demo.comm.ReturnObj;
import com.example.demo.enums.ExceptionEnum;
import com.example.demo.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.Vector;

@RestController
@RequestMapping("login")
public class HelloWorldController {

    @Autowired
    private HelloWorldService helloWorldService;

    @RequestMapping("sayHello")
    public ReturnObj sayHello(@RequestParam String who) throws MyException {
        if (StringUtils.isEmpty(who)) {
            throw new MyException(ExceptionEnum.ERROR);
        }
        ReturnObj returnObj = new ReturnObj();
        returnObj.setData(helloWorldService.getString(who));
        return returnObj;
    }
}
