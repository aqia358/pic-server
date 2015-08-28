package com.lhl.test.dao;

import java.io.Serializable;

/**
 * Created by liuhl on 15-8-27.
 */

public interface UserDaoI<T> {
    public Serializable save(T o);
}
