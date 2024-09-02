package dev.spring.project5;


import dev.spring.project5.bank.config.Config;
import dev.spring.project5.bank.controller.BankStatementAnalyzerSimple;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[]args){
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        BankStatementAnalyzerSimple analyzer = context.getBean(BankStatementAnalyzerSimple.class);

        analyzer.run("bank-data.csv");
    }
}
