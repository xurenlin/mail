package com.xrl.orderserver8095.mapper;

import com.xrl.orderserver8095.common.BaseMapper;
import com.xrl.orderserver8095.model.Order;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper extends BaseMapper<Order> {
}