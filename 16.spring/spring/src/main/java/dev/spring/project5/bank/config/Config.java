package dev.spring.project5.bank.config;

import dev.spring.project5.bank.model.BankTransaction;
import dev.spring.project5.bank.service.BankStatementProcessor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan(basePackages = "dev.spring.project5.bank")
public class Config {

}
