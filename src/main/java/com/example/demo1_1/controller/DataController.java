package com.example.demo1_1.controller;

import com.example.demo1_1.Mapper.DataMapper;
import com.example.demo1_1.Model.Service;
import com.example.demo1_1.Model.Shoppy;
import com.example.demo1_1.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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


    @RequestMapping("/shoppy")
    public  List<Shoppy> shoppy(Shoppy shoppy){

        System.out.println(shoppy);

        List<Shoppy> shoppy1 = dao.shoppy(shoppy);


        System.out.println(shoppy1);
        return shoppy1;
    }

    @RequestMapping("/service")
    public List<Service> service(Service v1){
        System.out.println(v1);
        return dao.service(v1);

    }

        //    上传文件
        @RequestMapping("/file")
        public String file(@Ma){
            System.out.println(v1);
            return dao.service(v1);

        }



}
