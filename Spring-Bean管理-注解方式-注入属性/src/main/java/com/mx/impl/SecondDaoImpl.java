package com.mx.impl;

import com.mx.dao.UserDao;
import org.springframework.stereotype.Repository;

/**
 * @author MX
 * @create 2021/10/15 20:49
 */
@Repository
public class SecondDaoImpl implements UserDao {
    @Override
    public void say() {
        System.out.println("Second class say...");
    }
}
