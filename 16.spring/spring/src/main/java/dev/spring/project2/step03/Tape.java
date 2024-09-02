package dev.spring.project2.step03;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;


@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
public class Tape {

    private String name;

    private boolean isWorked;



    //스프링이 기본적으로 매개변수가 있는 생성자를 자동으로 사용하여 빈을 생성하고 의존성을 주입
    //기본은 기본생성자로 주입됨
    //Autowired를 붙이면 해당 생성자로 주입
    @Autowired
    public Tape(@Value("나의 이름") String name, @Value("true") boolean isWorked) {
        this.name = name;
        this.isWorked = isWorked;
    }
}
