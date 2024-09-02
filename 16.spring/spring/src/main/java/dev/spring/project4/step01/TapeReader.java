package dev.spring.project4.step01;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Setter
@Getter
//@AllArgsConstructor
//@NoArgsConstructor
@Component
public class TapeReader {

    private Tape tape;

//    @Autowired
    // 생성자 1개이면 자동으로 autowired 됨
    public TapeReader(Tape tape) {
        this.tape = tape;
    }

    public void test() {
        if(tape.isWorked()){
            System.out.println(tape.getName()+"작동");
        }else
            System.out.println("사기");
    }

}
