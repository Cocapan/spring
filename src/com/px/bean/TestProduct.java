package com.px.bean;

public class TestProduct {

    private String name;

    private String description;

    private Category category;

    public TestProduct(){
        System.out.println("testP        roduct constructor~~~");
    }

    public Category getCategory() {
        return category;
    }

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
