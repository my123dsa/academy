package dev.spring.project3.step01;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Getter
@Setter
//@AllArgsConstructor
//@NoArgsConstructor
@Component
public class Tape {

    private String name;

    private boolean isWorked;

//    @Autowired
    public Tape(@Value("여기 사람 있어요") String name,@Value("true") boolean isWorked) {
        this.name = name;
        this.isWorked = isWorked;
    }
}
