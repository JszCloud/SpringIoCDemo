package cn.oo.test;

import cn.oo.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Created by Nominal on 2017/12/28 0028.
 * 微博：@李明易DY
 */
@Component
public class SpringIoCTest {
    @Autowired
    RegisterService registerService;

    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext(new String[]{"classpath:applicationContext.xml"});

        SpringIoCTest ioCTest = ctx.getBean(SpringIoCTest.class);
        ioCTest.testRegister();

        ((ClassPathXmlApplicationContext) ctx ).close();
    }
    public void testRegister(){
        registerService.doRegister();
    }

}
