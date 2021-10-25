package com.mx.impl;

import com.mx.dao.UserDao;
import org.springframework.stereotype.Repository;

/**
 * @author MX
 * @create 2021/10/14 20:20
 */
@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public void say() {
        System.out.println("注入UserDao后 saying....");
    }
}
