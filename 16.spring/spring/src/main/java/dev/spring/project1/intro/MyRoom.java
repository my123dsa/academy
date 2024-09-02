package dev.spring.project1.intro;

public class MyRoom {
    public static void main(String[] args) {
        TapeReader tapeReader= new TapeReader();
        Tape tape = new Tape("아일랜드",true);
        tapeReader.setTape(tape);  //이게 의존성 주입한것 tape에 대한 의존성을 reader에 주입
        //tape없으면 reader는 동작 불가
        tapeReader.test();
    }
}
