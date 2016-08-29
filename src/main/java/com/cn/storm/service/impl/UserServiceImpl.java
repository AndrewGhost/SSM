package com.cn.storm.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cn.storm.dao.IUserDao;
import com.cn.storm.pojo.User;
import com.cn.storm.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {
  @Resource
  private IUserDao userDao;
  @Override
  public User getUserById(int userId) {
    // TODO Auto-generated method stub
    return this.userDao.selectByPrimaryKey(userId);
    
  }
}
