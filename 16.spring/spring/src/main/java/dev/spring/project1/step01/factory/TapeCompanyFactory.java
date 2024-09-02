package dev.spring.project1.step01.factory;

public class TapeCompanyFactory {
    public static TapeReader createTapeReader(){
        return new TapeReader();
    }
    public static Tape createTape(String name, boolean b){
        return new Tape(name,b);
    }
}
