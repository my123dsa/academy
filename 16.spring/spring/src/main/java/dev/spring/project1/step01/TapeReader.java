package dev.spring.project1.step01;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

//@Setter
@Getter
@AllArgsConstructor
//@NoArgsConstructor
@RequiredArgsConstructor
public class TapeReader {

    private final Tape tape;

    public void test() {
        if(tape.isWorked()){
            System.out.println(tape.getName()+"작동");
        }else
            System.out.println("사기");
    }
//// setter기반 주입
//    public void setTape(Tape tape) {
//        System.out.println("여기 호출됨");
//        this.tape = tape;
//    }

}
