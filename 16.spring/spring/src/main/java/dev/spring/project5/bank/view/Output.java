package dev.spring.project5.bank.view;

import org.springframework.stereotype.Controller;

@Controller
public class Output {
    public void print(Object object) {
        System.out.println(object);
    }

}
