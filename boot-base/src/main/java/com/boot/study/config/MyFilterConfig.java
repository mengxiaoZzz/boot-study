package com.boot.study.config;

import com.boot.study.filters.MyFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author gu
 * @date 2022-05-20
 */
@Configuration
public class MyFilterConfig {

    /**
     * 通过不同的泛型，指定不同filter的过滤规则
     */
    @Bean
    public FilterRegistrationBean<MyFilter> registerFilter() {
        FilterRegistrationBean<MyFilter> registrationBean = new FilterRegistrationBean<>();
        // 注册自定义过滤器
        registrationBean.setFilter(new MyFilter());
        // 过滤器名称
        registrationBean.setName("myFilter");
        // 过滤匹配的路径
        registrationBean.addUrlPatterns("/*");
        // 设置优先级  order值越小，表示优先级越高
        registrationBean.setOrder(1);

        return registrationBean;
    }

}
