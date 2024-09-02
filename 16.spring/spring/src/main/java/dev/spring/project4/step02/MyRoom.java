package dev.spring.project4.step02;


import dev.spring.project4.step01.TapeReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyRoom {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);

        Drink drink=context.getBean(Drink.class);
        System.out.println(drink);
        TapeReader reader=context.getBean(TapeReader.class);
        reader.test();
        ((AnnotationConfigApplicationContext)context).close();
    }
}
