package com.mynotepadproject.spring.service;

import com.mynotepadproject.spring.dto.UsersDto;

import java.util.List;

public interface UsersService {
    UsersDto saveUser(UsersDto usersDto);

    void deleteUser(Integer userId);

    UsersDto findByLogin(String login);

    List<UsersDto> findAll();
}
