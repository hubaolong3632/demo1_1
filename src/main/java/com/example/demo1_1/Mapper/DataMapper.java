package com.example.demo1_1.Mapper;

import com.example.demo1_1.Model.*;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface DataMapper {

    @Select("select * from user where username=#{v1.username} and password=#{v1.password}")
    public User login(@Param("v1") User user);

   public List<Shoppy> shoppy(Shoppy v1);


   public List<Service> service(Service v1);

    @Update("update  service_info set status=#{status} where id=#{id}")
   public Integer addService(Service v1);


    @Delete("delete  from service_info where id=#{id}")
    public Integer deleteService(Service v1);

    @Select("select id,name from service_type")
    public List<SType> fromType();


    @Select("select service_content_id,service_content_name,service_type_id from service_content where service_type_id=#{service_type_id}")
    public List<SContent> fromContent(SContent sc);


    public Integer insertService(InsertService sc);


    @Update("update service_info set service_type_id = #{service_type_id}, " +
            "service_content_id = #{service_content_id}," +
            "introduction = #{introduction}," +
            "details = #{details} " +
            ",promotional_image = #{promotional_image}," +
            "promotional_logo = #{promotional_logo}," +
            "price = #{price}," +
            "create_user_id = 1," +
            "update_time = #{update_time}" +
            " where id = #{id}")
    public Integer updateService(InsertService sc);

}

