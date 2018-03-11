package com.px.bean;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component("category")
public class Category {

//    private String name = "ElectronicProducts";
    private String name;


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

//    @PostConstruct
    public void init(){
        System.out.println("init category");
    }

//    @PreDestroy
    public void destory(){
        System.out.println("destory category");
    }

    public Category(){
        System.out.println("category contructor~~~");
    }

}
