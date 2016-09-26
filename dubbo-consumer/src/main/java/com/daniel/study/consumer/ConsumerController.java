package com.daniel.study.consumer;

import com.daniel.study.test.IHelloWorld;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @Brief :  ${用途}
 * @Author: liangfei/liangfei@simpletour.com
 * @Date :  2016/9/26 10:56
 * @Since ： ${VERSION}
 * @Remark: ${Remark}
 */
@RequestMapping(value = "/dubbo")
@Controller
public class ConsumerController {

    @Resource
    IHelloWorld helloWorld;

    @RequestMapping(value = "sayHello/{name}",method = RequestMethod.GET)
    @ResponseBody
    public String sayHello(@PathVariable String name){
        return helloWorld.sayHello(name);
    }
}
