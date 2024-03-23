package com.example.demo1_1.Model;


import lombok.Data;

import java.util.Date;

@Data
public class InsertService {
    public Integer id;
    public String service_type_id;
    public String service_content_id;
    public String introduction;
    public String details;
    public String promotional_image;
    public String promotional_logo;
    public String price;
    public Integer volunteer_open_flag;
    public Integer certificate_flag;
    public String status;
    public Integer create_user_id;
    public Date create_time;
    public Date update_time;
}
