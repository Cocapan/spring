package com.px.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component("product")
public class Product {

    private String name = "iphone6s";

    private String description = "call,photo,listen music,chat and so on";

    //@Autowired //只有spring配置文件中初始化了一个CateGory对象时，才能正常获取，如果初始化了两个对象，该注解无法识别。
    //@Resource(name="categoryTwo")//如果spring配置文件中初始化了多个对象，可以通过该注解指定引用获取指定的CateGory对象。
    private Category category;

    public Category getCategory() {
        return category;
    }

    //@Autowired
    @Resource(name="category")
    public void setCategory(Category category) {
        this.category = category;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
