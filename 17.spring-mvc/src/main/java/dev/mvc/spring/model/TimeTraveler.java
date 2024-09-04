package dev.mvc.spring.model;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class TimeTraveler {
    private int id;
    private int realAge;
    private String name;
    private String place;
    private int newAge;
}
