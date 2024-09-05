package dev.spring.petclinic.springmvcpractice.repository;

import dev.spring.petclinic.springmvcpractice.model.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PetsRepository extends JpaRepository<Pet, Long> {
    @Query("select p from Pet p where p.owner.id=:ownerId")
    List<Pet> findAllByOwner(Long ownerId);
}
