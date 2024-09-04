package dev.mvc.spring.service;

import dev.mvc.spring.model.TimeTraveler;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TimeTravelerService {

    private static List<TimeTraveler> travelers;

    static {
        TimeTraveler mini = new TimeTraveler(1,10, "미니", "하와이", 5);
        TimeTraveler mickey = new TimeTraveler(2,25, "미키", "런던", 21);
        TimeTraveler jay = new TimeTraveler(3,15, "제이", "상하이", 11);
        TimeTraveler jerry = new TimeTraveler(4,20, "제리", "도쿄",25);
        TimeTraveler jamie = new TimeTraveler(5,40, "제이미", "대한민국", 20);

        TimeTraveler[] mouseArray = { mini, mickey, jay, jerry, jamie };

        travelers = new ArrayList<>(Arrays.asList(mouseArray));
    }

    public List<TimeTraveler> findAll() {
        // DB에서 Mouse 목록 조회 처리 수행했다고 가정

        return travelers;
    }

    public void add(TimeTraveler timeTraveler) {
        travelers.add(timeTraveler);
    }
}
