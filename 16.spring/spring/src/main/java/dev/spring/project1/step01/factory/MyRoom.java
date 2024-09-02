package dev.spring.project1.step01.factory;

public class MyRoom {
    public static void main(String[] args) {

        // 직접 의존성 직접 만듦
//        TapeReader tapeReader= new TapeReader();
        // 외부에서 의존성 주입 -> 의존성 주입됨
        TapeReader tapeReader= TapeCompanyFactory.createTapeReader();
        Tape tape= TapeCompanyFactory.createTape("주입된 테이프",true);
        tapeReader.test(tape);
    }
}
