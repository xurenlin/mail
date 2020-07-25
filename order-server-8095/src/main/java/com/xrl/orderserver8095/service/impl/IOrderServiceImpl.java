package com.xrl.orderserver8095.service.impl;

import com.xrl.orderserver8095.mapper.OrderMapper;
import com.xrl.orderserver8095.model.Order;
import com.xrl.orderserver8095.service.OrderService;
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
public class IOrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper mapper;


    @Override
    public boolean insert(Order model) {
        return mapper.insert(model)>0;
    }

    @Override
    public boolean update(Order model) {
        return mapper.updateByPrimaryKey(model)>0;
    }

    @Override
    public boolean delete(Order model) {
        return mapper.delete(model)>0;
    }

}
