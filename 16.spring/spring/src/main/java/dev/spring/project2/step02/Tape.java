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

    @Value("너의 이름은")
    public void setName(String name) {
        this.name = name;
    }

    @Value("true")
    public void setWorked(boolean worked) {
        isWorked = worked;
    }
}
