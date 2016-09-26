package com.daniel.study.consumer;

import com.daniel.study.test.IHelloWorld;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Brief :  ${用途}
 * @Author: liangfei/liangfei@simpletour.com
 * @Date :  2016/9/26 10:56
 * @Since ： ${VERSION}
 * @Remark: ${Remark}
 */
@Controller
public class ConsumerController {


    IHelloWorld helloWorld;

    @RequestMapping("sayHello/{name:\\d+}")
    @ResponseBody
    public String sayHello(@PathVariable String name){
        return helloWorld.sayHello(name);
    }
}
