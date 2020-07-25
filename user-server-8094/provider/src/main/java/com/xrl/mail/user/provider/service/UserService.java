package com.xrl.mail.user.provider.service;



public interface UserService {

    //添加用户
    public boolean insert(User model);

    //修改用户
    public boolean update(User model);

    //删除用户
    public boolean delete(User model);


}
