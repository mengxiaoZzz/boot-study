package com.boot.study.runners;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author gu
 * @date 2022-05-20
 */
@Slf4j
@Component
@Order(2)
public class MyCommandLineRunner implements CommandLineRunner {

    @Override
    public void run(String... args) {
        log.info("通过实现CommandLineRunner接口,在spring boot项目启动后执行");
    }

}
