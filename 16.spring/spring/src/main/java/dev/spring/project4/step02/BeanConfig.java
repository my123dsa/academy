package dev.spring.project4.step02;

import dev.spring.project4.step01.Tape;
import dev.spring.project4.step01.TapeReader;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan
public class BeanConfig {
    @Bean
    public TapeReader tapeReader(Tape tape) {
        return new TapeReader(tape);
    }
    @Bean
    public Tape tape() {
        return new Tape("체크",true);
    }

    @Bean
    public Drink Drink() {
        return new Drink("페어",100);
    }
}
