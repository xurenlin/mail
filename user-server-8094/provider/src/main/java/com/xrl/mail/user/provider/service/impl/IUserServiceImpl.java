package com.xrl.mail.user.provider.service.impl;

import com.xrl.mail.user.provider.mapper.UserMapper;
import com.xrl.mail.user.provider.service.UserService;
import com.xrl.orderserver8095.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @ClassName springdemo
 * @Description TODO
 * @Author xrl
 * @Date 2020/7/9 19:43
 * @Version 1.0
 **/
@Service
@Transactional
public class IUserServiceImpl implements UserService {

    @Autowired
    private UserMapper mapper;


    @Override
    public boolean insert(User model) {
        return mapper.insert(model)>0;
    }

    @Override
    public boolean update(User model) {
        return mapper.updateByPrimaryKey(model)>0;
    }

    @Override
    public boolean delete(User model) {
        return mapper.delete(model)>0;
    }

}
