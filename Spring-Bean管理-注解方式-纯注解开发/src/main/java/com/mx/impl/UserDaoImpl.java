package com.mx.impl;

import com.mx.dao.UserDao;
import org.springframework.stereotype.Repository;

/**
 * @author MX
 * @create 2021/10/15 10:37
 */
@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public void say() {
        System.out.println("Wired UserDao saying...");
    }
}
