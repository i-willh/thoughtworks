package com.qyihu.study.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by weihuang on 02/03/2017.
 */
@RestController
@EnableAutoConfiguration
public class SampleController {

    protected static Logger logger =
            LoggerFactory.getLogger(SampleController.class);

    @RequestMapping("/")
    @ResponseBody
    public String home() {
        logger.info("访问 home()");
        return "hello world";
    }

    @RequestMapping("/hello/{myName}")
    public String index(@PathVariable String myName) {
        logger.debug("访问 index()");
        System.out.println();
        System.out.println("SampleController.index");
        return "hello " + myName + "!!!";
    }

    public static void main(String[] args) {
        SpringApplication.run(SampleController.class, args);
    }
}
