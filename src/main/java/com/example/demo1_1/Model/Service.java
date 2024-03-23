package com.example.demo1_1.Model;

import lombok.Data;

@Data
public class Service {
    public Integer id;
    public String name;
    public String service_content_name;
    public String introduction;
    public String price;
    public String status;

    public String promotional_image;
    public String promotional_logo;

    public Integer service_content_id;
    public Integer service_type_id;
    public String details;


}
