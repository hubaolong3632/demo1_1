package com.example.demo1_1.Mapper;


import com.example.demo1_1.Model.Content;
import com.example.demo1_1.Model.Home;
import com.example.demo1_1.Model.Type;
import com.example.demo1_1.Model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DataMapper {

    @Select("select * from user where username=#{v1.username} and password=#{v1.password}")
    public User login(@Param("v1") User user);


    @Select("select service_content_id,service_content.service_content_name,service_content.service_type_id from service_content")
    public List<Content> content();


    @Select("select id,name from service_type")
    public List<Type> type();


    public List<Home> home(@Param("v") Home home);
}
