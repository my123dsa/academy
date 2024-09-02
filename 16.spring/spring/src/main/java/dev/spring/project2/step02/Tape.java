package dev.spring.project2.step02;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;


@Getter
//@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Tape {

    private String name;

    private boolean isWorked;


    public void setName(@Value("너의 이름은") String name) {
        this.name = name;
    }


    public void setWorked(@Value("true") boolean worked) {
        isWorked = worked;
    }
}
