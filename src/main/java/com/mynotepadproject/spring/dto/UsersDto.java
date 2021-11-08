package com.mynotepadproject.spring.dto;

import lombok.Data;

@Data
public class UsersDto {
    private Integer id;
    private String name;
    private String login;
    private String email;
}
