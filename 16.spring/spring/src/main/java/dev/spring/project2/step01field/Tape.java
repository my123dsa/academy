package dev.spring.project2.step01field;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Tape {
    @Value("아일랜드")
    private String name;

    @Value("true")
    private boolean isWorked;
}
