package com.jk.service;

import com.jk.model.User;

import java.util.List;

/**
 * Created by lyc on 2018/4/3.
 */
public interface IUserService {

     public List<User>  queryUserList(User user);
}
