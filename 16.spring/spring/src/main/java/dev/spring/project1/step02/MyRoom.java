package dev.spring.project1.step02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyRoom {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("constructor-config.xml");

        TapeReader reader=context.getBean(TapeReader.class);
        reader.test();
    }
}
