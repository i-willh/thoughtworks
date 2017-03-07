package com.qyihu.study.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by weihuang on 03/03/2017.
 */
@SpringBootApplication
public class Application {


    public static void main(String[] args) {
        System.out.println("start execute main method...");
        SpringApplication.run(Application.class, args);
    }
}
