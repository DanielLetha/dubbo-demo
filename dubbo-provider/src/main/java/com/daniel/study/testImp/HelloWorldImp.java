package com.daniel.study.testImp;

import com.daniel.study.test.IHelloWorld;
import org.springframework.stereotype.Service;

/**
 * @Brief :  ${用途}
 * @Author: liangfei/liangfei@simpletour.com
 * @Date :  2016/9/26 10:39
 * @Since ： ${VERSION}
 * @Remark: ${Remark}
 */
@Service
public class HelloWorldImp implements IHelloWorld {

    public String sayHello(String name) throws InterruptedException {

        System.out.println("Hello ,"+name);
        Thread.sleep(5000);
        return "Hello ," +name;
    }

}
