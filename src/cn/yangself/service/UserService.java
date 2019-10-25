package cn.yangself.service;

import cn.yangself.dao.UserDao;
import cn.yangself.domain.User;

/**
 * 这个类是业务类，进行数据的处理
 */
public class UserService {
    public User find(){
        UserDao userDao = new UserDao();//调用DAO类进行数据查询
        return userDao.find();//查到数据了进行返回
    }
}
