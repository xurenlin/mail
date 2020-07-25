package com.xrl.orderserver8095.controller;

/**
 * @ClassName springdemo
 * @Description TODO
 * @Author xrl
 * @Date 2020/7/12 15:57
 * @Version 1.0
 **/

import com.xrl.orderserver8095.model.Order;
import com.xrl.orderserver8095.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("order")
public class OrderController {

    @Autowired
    public OrderService service;


    @GetMapping("selectOrderById")
    public ResponseEntity<Integer> selectUserById() {
        Order model = new Order();
        model.setGoodsid(1);
        model.setPid("123sds");
        model.setUserid(1);
        boolean flg = service.insert(model);
        return new ResponseEntity<>(1, HttpStatus.OK);
    }


}
