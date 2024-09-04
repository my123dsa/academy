package dev.spring.petclinic.springmvcpractice.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@AllArgsConstructor
@Table(name = "owners")
@Builder
@ToString(exclude = "pets")
@Setter
public class Owner extends Person {

    private String address;
    private String city;
    private String telephone;

    @OneToMany(mappedBy = "owner",fetch = FetchType.LAZY)
    @Builder.Default
    private List<Pet> pets= new ArrayList<>();
}
