package dev.spring.project1.step01.factory;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TapeReader {
    private Tape tape;

    public void test(Tape tape) {
        if(tape.isWorked()){
            System.out.println(tape.getName()+"작동");
        }else
            System.out.println("사기");
    }
}
