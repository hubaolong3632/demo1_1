package com.example.demo1_1.controller;

import com.example.demo1_1.Mapper.DataMapper;
import com.example.demo1_1.Model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@RestController
@CrossOrigin("*")
public class DataController {
    @Autowired
    public DataMapper dao;

    @RequestMapping("/login")
    public Boolean login(User user) {
        return dao.login(user) != null ? true : false;
    }


    @RequestMapping("/shoppy")
    public List<Shoppy> shoppy(Shoppy shoppy) {

        System.out.println(shoppy);

        List<Shoppy> shoppy1 = dao.shoppy(shoppy);


        System.out.println(shoppy1);
        return shoppy1;
    }

    @RequestMapping("/service")
    public List<Service> service(Service v1) {
        System.out.println(v1);
        return dao.service(v1);

    }


    @RequestMapping("/addService")
    public Integer addService(Service v1) {
        System.out.println(v1);
        return dao.addService(v1);
    }


    @RequestMapping("/deleteService")

    public Integer deleteService(Service v1) {
        return dao.deleteService(v1);
    }


    @RequestMapping("/fromType")
    public List<SType> fromType() {
        return dao.fromType();
    }

    @RequestMapping("/fromContent")

    public List<SContent> fromContent(SContent sc) {
        return dao.fromContent(sc);
    }


    @RequestMapping("/InsertService")
    public Integer insertService(InsertService sc) {
        System.out.println(sc);

        sc.setCreate_time(new Date());
        sc.setStatus("1"); //已上架
        sc.setCertificate_flag(1);
        return dao.insertService(sc);
    }


    //    public  static  String file1=System.getProperty("user.dir")+"/";
    @RequestMapping("/file")
    public String file(@RequestParam("file") MultipartFile file) {

        try {
            String name = file.getOriginalFilename();

            name = UUID.randomUUID() + "." + name.split("\\.")[1];

//           Path path = Paths.get(file1 + name);
            Path path = Paths.get("d:/c1/" + name);

            Files.copy(file.getInputStream(), path);

            String s = ServletUriComponentsBuilder.fromCurrentContextPath().build() + "/" + name;

            return s;

        } catch (Exception e) {
            return "失败" + e.getMessage();
        }

    }


    @RequestMapping("/updateService")
    public Integer updateService(InsertService sc) {
        System.out.println(sc);

        sc.setUpdate_time(new Date());
        return dao.updateService(sc);
    }


}
