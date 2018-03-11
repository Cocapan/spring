package com.px.config;

import com.px.bean.Category;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class CategoryConfig {

    @Bean(initMethod = "init",destroyMethod = "destory")
    @Scope("prototype")
    public Category categoryone(){
        return new Category();
    }

}
