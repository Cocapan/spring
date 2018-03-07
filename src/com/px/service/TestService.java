package com.px.service;

import org.springframework.stereotype.Component;

@Component("testService")
public class TestService {

    public void test(){
        StringBuffer sb = new StringBuffer();
//        String s = "";
        for (int i=0;i<100000;i++){
            sb.append(i);
//            s += i;
        }
        System.out.println("Use StringBuffer: " + sb.toString());
//        System.out.println("Use String: " + s);
    }

}
