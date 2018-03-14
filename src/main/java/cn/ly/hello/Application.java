package cn.ly.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by liuyu21 on 2017/12/3.
 */
@Configuration
@ComponentScan
public class Application {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleController.class, args);
    }

}