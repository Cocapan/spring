package com.px.bean;

import org.springframework.stereotype.Component;

@Component("category")
public class Category {

    private String name = "ElectronicProducts";

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}
