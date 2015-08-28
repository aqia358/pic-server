package com.lhl.test.service;

import com.lhl.test.dao.UserDaoI;
import com.lhl.test.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by liuhl on 15-8-27.
 */
@Service("userService")
@Transactional
public class UserService      //之前这里写错成了UserServiceImpl，谢谢wangdianyong的提醒，此处已做修改
{
    //自动注入dao
    @Autowired
    private UserDaoI<User> userDao;

    public void addUser(User user) {
        userDao.save(user);
    }

}

