package com.example.demo1_1.controller;

import com.example.demo1_1.Mapper.DataMapper;
import com.example.demo1_1.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class DataController {
    @Autowired
    public DataMapper dao;

    @RequestMapping("/login")
    public Boolean login(User user){
        User login = dao.login(user);
        System.out.println(login);


        if(login!=null){
            return true;
        }else {
            return false;
        }


    }

}
