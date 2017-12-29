package cn.oo.service;

import cn.oo.dao.RegisterDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Created by Nominal on 2017/12/28 0028.
 * 微博：@李明易DY
 */
@Service
public class RegisterService {
    @Autowired
    RegisterDao registerDao;

    public RegisterService(RegisterDao registerDao) {
        this.registerDao = registerDao;
    }

    public RegisterService() {
    }

    public void doRegister(){


        registerDao.saveUser();
    }
}
