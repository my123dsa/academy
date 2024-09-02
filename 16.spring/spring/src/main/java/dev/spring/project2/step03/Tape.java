package dev.spring.project2.step03;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;


@Getter
//@Setter
//@AllArgsConstructor
@NoArgsConstructor
public class Tape {

    private String name;

    private boolean isWorked;

    @Autowired
    public Tape(@Value("나의 이름") String name, @Value("true") boolean isWorked) {
        this.name = name;
        this.isWorked = isWorked;
    }
}
