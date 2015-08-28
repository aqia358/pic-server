package com.lhl.test.dao.impl;

import java.io.Serializable;

import com.lhl.test.dao.UserDaoI;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


/**
 * Created by liuhl on 15-8-27.
 */
@Repository("userDao")
public class UserDaoImpl<T> implements UserDaoI<T> {
    //注入sessionfactory
    @Autowired
    private SessionFactory sessionFactory;

    public Serializable save(T o) {
        return sessionFactory.getCurrentSession().save(o);
    }

}
