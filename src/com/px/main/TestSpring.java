package com.px.main;

import com.px.bean.Category;
import com.px.bean.Product;
import com.px.service.ProductService;
import com.px.service.TestService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestSpring {

    @Autowired
    Category category;
    @Autowired
    Product product;
    @Autowired
    ProductService productService;
    @Autowired
    TestService testService;

    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "applicationContext.xml" });
        System.out.println(category.getName());
        System.out.println("This is a product " + product.getName() + ", it can " + product.getDescription() + ". it belong to " + product.getCategory().getName());
        productService.call();
        testService.test();
    }


    /*public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "applicationContext.xml" });
        Category c = (Category) context.getBean("category");
        Product product = (Product) context.getBean("product");
        System.out.println(c.getName());
        System.out.println("This is a product " + product.getName() + ", it can " + product.getDescription() + ". it belong to " + product.getCategory().getName());
        ProductService productServic = (ProductService) context.getBean("productService");
        productServic.call();
        TestService testService = (TestService) context.getBean("testService");
        testService.test();
    }*/
}
