package dev.spring.project1.step02;

import dev.spring.project1.step01.factory.Tape;
import dev.spring.project1.step01.factory.TapeReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyRoom {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("setter-config.xml");
        TapeReader reader=context.getBean(TapeReader.class);
        System.out.println(reader);
        Tape tape = context.getBean(Tape.class);
        System.out.println(tape);
    }
}
