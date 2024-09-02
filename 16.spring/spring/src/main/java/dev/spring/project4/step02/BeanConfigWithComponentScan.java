package dev.spring.project4.step02;

import dev.spring.project4.step01.Tape;
import dev.spring.project4.step01.TapeReader;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "dev.spring.project4")
public class BeanConfigWithComponentScan {
//    @Bean
//    public TapeReader tapeReader(Tape tape) {
//        return new TapeReader(tape);
//    }
//    @Bean
//    public Tape tape() {
//        return new Tape("하이",true);
//    }
}
