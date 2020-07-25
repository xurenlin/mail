package com.xrl.orderserver8095.service;


import com.xrl.orderserver8095.model.Order;

public interface OrderService {

    //添加用户
    public boolean insert(Order model);

    //修改用户
    public boolean update(Order model);

    //删除用户
    public boolean delete(Order model);


}
