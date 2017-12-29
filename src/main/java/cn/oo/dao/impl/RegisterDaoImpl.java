package cn.oo.dao.impl;

import cn.oo.dao.RegisterDao;
import org.springframework.stereotype.Repository;

/**
 * Created by Nominal on 2017/12/28 0028.
 * 微博：@李明易DY
 */
@Repository
public class RegisterDaoImpl implements RegisterDao {
    public void saveUser() {
        System.out.println("用户信息已保存!");
    }
}
