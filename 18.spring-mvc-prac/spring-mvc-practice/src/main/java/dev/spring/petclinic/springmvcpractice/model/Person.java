package dev.spring.petclinic.springmvcpractice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.MappedSuperclass;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@MappedSuperclass

public class Person extends BaseEntity {
    private String firstName;
    private String lastName;
}
