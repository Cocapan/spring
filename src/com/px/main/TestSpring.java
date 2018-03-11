package com.px.main;

import com.px.bean.*;
import com.px.config.CategoryConfig;
import com.px.service.ProductService;
import com.px.service.TestService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Map;


/*@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")*/
public class TestSpring {

    /*@Autowired
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
    }*/


    public static void main(String[] args) {
        /*AbstractApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "applicationContext.xml" });
        Category c = (Category) context.getBean("categoryOne");
        System.out.println(c.getName());
        c.setName("new categoryOne");
        c = (Category) context.getBean("categoryOne");
        Product product = (Product) context.getBean("product");
        System.out.println(c.getName());
        System.out.println("This is a product " + product.getName() + ", it can " + product.getDescription() + ". it belong to " + product.getCategory().getName());
        TestProduct testProduct = (TestProduct) context.getBean("productTest");
        System.out.println(testProduct.getName());
        ProductService productService = (ProductService) context.getBean("productService");
        productService.call();
        TestService testService = (TestService) context.getBean("testService");
        testService.test();
        ConstructorBean nameConstructorBean = (ConstructorBean) context.getBean("nameConstructorBean");
        ConstructorBean categoryConstructorBean = (ConstructorBean) context.getBean("categoryConstructorBean");
        JavaCollection collectionTest = (JavaCollection) context.getBean("collectionTest");
        System.out.println("ListTest:");
        for (String s : collectionTest.getStringList()){
            System.out.println(s + " ");
        }

        System.out.println("SetTest:");
        for (String s : collectionTest.getStringSet()){
            System.out.println(s + " ");
        }
        System.out.println("MapTest:");
        for (Map.Entry s : collectionTest.getStringMap().entrySet()){
            System.out.println("key: " + s.getKey() + ",value: " + s.getValue());
        }
        System.out.println("CategroyListTest:");
        for (Category category : collectionTest.getCategoryList()){
            System.out.println("category name: " + category.getName());
        }
        context.registerShutdownHook();*/
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(CategoryConfig.class);
        Category category = (Category) annotationConfigApplicationContext.getBean("categoryone");
        category.setName("panxuan");
        System.out.println(category.getName());
        category = (Category) annotationConfigApplicationContext.getBean("categoryone");
        System.out.println(category.getName());
    }
}
