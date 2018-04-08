package com.jk.service.impl;

import com.jk.dao.UserMapper;
import com.jk.model.User;
import com.jk.service.IUserService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lyc on 2018/4/3.
 */
@Service("userService")
public class UserServiceImpl implements IUserService {

    //@Autowired
    private UserMapper userMapper;


    public List<User> queryUserList(User user) {

        return userMapper.queryUserList(user);
    }
}
