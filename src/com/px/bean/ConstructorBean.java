package com.px.bean;

public class ConstructorBean {

    public ConstructorBean(String name, int age){
        System.out.println("ConstructorBean name: " + name + ",age: " + age);
    }

    public ConstructorBean(Category category){
        System.out.println("ConstructorBean category name: " + category.getName());
    }

}
