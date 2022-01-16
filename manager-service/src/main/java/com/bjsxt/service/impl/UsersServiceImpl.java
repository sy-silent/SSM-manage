package com.bjsxt.service.impl;

import com.bjsxt.mapper.UsersMapper;
import com.bjsxt.pojo.Users;
import com.bjsxt.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersMapper usersMapper;


    public void addUser(Users users) {
        System.out.println("3");
        this.usersMapper.insertUser(users);
    }

    public List<Users> selectUserAll() {
        List<Users> users = this.usersMapper.selectUserAll();
        return users;
    }


}
