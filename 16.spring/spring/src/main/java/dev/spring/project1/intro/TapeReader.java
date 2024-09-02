package dev.spring.project1.intro;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TapeReader {
    private Tape tape;

    public void test(){
        if(tape.isWorked()){
            System.out.println(tape.getName()+"작동");
        }else
            System.out.println("사기");
    }
}
