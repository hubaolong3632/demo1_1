package com.example.demo1_1.Model;

import lombok.Data;

@Data
public class User {
    public String username;
    public String password;
    public String salt;
}
