package cn.yangself.dao;

import cn.yangself.domain.User;

/**
 * 数据操作类（DAO），进行数据的查找与存储
 */
public class UserDao {
    public User find(){
        return new User("zhangSan","123456");//在这里先创建一个假查询，以便使用
    }
}
