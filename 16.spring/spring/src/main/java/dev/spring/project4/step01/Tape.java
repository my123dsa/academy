package dev.spring.project4.step01;

import lombok.Getter;
import lombok.Setter;
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


    public Tape(String name,boolean isWorked) {
        this.name = name;
        this.isWorked = isWorked;
    }
}
