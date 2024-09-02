package dev.spring.project3.step02;

import dev.spring.project2.step03.TapeReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyRoom {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext("dev.spring.project3.step02");

        Drink drink=context.getBean(Drink.class);
        System.out.println(drink);
        TapeReader reader=context.getBean(TapeReader.class);
        System.out.println(reader);
    }
}
