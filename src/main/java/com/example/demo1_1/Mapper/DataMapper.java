package com.example.demo1_1.Mapper;

import com.example.demo1_1.Model.Service;
import com.example.demo1_1.Model.Shoppy;
import com.example.demo1_1.Model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DataMapper {

    @Select("select * from user where username=#{v1.username} and password=#{v1.password}")
    public User login(@Param("v1") User user);

   public List<Shoppy> shoppy(Shoppy v1);


   public List<Service> service(Service v1);



}
