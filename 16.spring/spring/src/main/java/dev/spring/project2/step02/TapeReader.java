package dev.spring.project2.step02;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

//@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class TapeReader {

    private Tape tape;

    public void test() {
        if(tape.isWorked()){
            System.out.println(tape.getName()+"작동");
        }else
            System.out.println("사기");
    }

    @Autowired
    public void setTape(Tape tape) {
        this.tape = tape;
    }
}
