package com.daniel.study.testImp;

import com.daniel.study.test.IHelloWorld;

/**
 * @Brief :  ${用途}
 * @Author: liangfei/liangfei@simpletour.com
 * @Date :  2016/9/26 10:39
 * @Since ： ${VERSION}
 * @Remark: ${Remark}
 */
public class HelloWorldImp implements IHelloWorld {

    public String sayHello(String name) {
        System.out.println("Hello ,"+name);
        return "Hello ," +name;
    }

}