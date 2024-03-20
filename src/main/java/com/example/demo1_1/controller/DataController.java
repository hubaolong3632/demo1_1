package com.example.demo1_1.controller;

import com.example.demo1_1.Mapper.DataMapper;
import com.example.demo1_1.Model.Service;
import com.example.demo1_1.Model.Shoppy;
import com.example.demo1_1.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.UUID;

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
    public List<Shoppy> shoppy(Shoppy shoppy){

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
        @PostMapping("/file")
        public String file(@RequestParam("file") MultipartFile file){
            try{
                String name = file.getOriginalFilename();


               new File("D:/c1/").mkdirs();
                name= UUID.randomUUID()+"."+name.split("\\.")[1];


                Path path = Paths.get("D:/c1/" + name);


                Files.copy(file.getInputStream(),path);

                String URL=ServletUriComponentsBuilder.fromCurrentContextPath().build()+"/"+name;



                return URL;
            }catch (Exception e){
                return "上传失败"+e.getMessage();
            }



        }



}
