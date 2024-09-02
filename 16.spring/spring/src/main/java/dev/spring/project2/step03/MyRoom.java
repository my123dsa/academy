package dev.spring.project2.step03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyRoom {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("annotation-config-constructor.xml");
        TapeReader reader=context.getBean(TapeReader.class);
        reader.test();
    }
}
