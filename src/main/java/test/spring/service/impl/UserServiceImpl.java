package test.spring.service.impl;

import test.spring.dao.UserDao;
import test.spring.pojo.User;
import test.spring.service.UserService;

public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao){
        this.userDao = userDao;
    }

    @Override
    public User userInfo() {
        return userDao.userInfo();
    }
}
