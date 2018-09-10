package test.spring.dao.impl;

import test.spring.dao.UserDao;
import test.spring.pojo.User;

public class UserDaoImpl implements UserDao {

    private User user;

    public void setUser(User user){
        this.user = user;
    }


    @Override
    public User userInfo() {

        user.setAge(1);
        user.setGender(1);
        user.setUsername("a");

        return user;
    }
}
