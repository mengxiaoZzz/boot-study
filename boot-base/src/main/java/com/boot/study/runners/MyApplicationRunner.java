package com.boot.study.runners;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author gu
 * @date 2022-05-20
 * <p>
 * 可以使用 @Order注解或Ordered接口,有序执行
 * order值越小,执行优先级越高
 * <p>
 * ApplicationRunner 与 CommandLineRunner区别:
 * 1、ApplicationRunner的 run方法的参数为 ApplicationArguments  对参数进行了封装
 * 2、CommandLineRunner的 run方法的参数为 String... args  直接传入字符串
 */
@Slf4j
@Component
@Order(1)
public class MyApplicationRunner implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) {
        log.info("通过实现ApplicationRunner接口,在spring boot项目启动后执行");
    }

}
