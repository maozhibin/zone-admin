package com.cunyun.zoneadmin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.concurrent.CountDownLatch;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author liuke1@geely.com
 * @version 1.0
 * @since v1.0 2017/11/8 13:54
 
 */
@ServletComponentScan
@MapperScan(value="com.cunyun.zoneadmin.dal.dao")
@SpringBootApplication
public class Bootstrap {
    @Bean
    public CountDownLatch closeLatch() {
        return new CountDownLatch(1);
    }

    public static void main(String[] args) throws InterruptedException {
        SpringApplication application = new SpringApplication(Bootstrap.class);
        ApplicationContext ctx = application.run(args);
        CountDownLatch closeLatch = ctx.getBean(CountDownLatch.class);
        Runtime.getRuntime().addShutdownHook(new Thread(() -> closeLatch.countDown()));
        closeLatch.await();
        System.out.println("init success!");
    }


}
