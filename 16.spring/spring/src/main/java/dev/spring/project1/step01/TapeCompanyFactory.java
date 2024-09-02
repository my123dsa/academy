package dev.spring.project1.step01;

public class TapeCompanyFactory {
    public static TapeReader createTapeReader(){
        return new TapeReader(new Tape());
    }
    public static Tape createTape(String name, boolean b){
        return new Tape(name,b);
    }
}
