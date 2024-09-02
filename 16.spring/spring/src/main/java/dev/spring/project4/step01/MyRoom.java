package dev.spring.project4.step01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyRoom {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("annotation-component-scan.xml");
        TapeReader reader=context.getBean(TapeReader.class);
        reader.test();
    }
}
