package dev.spring.petclinic.springmvcpractice.repository;

import dev.spring.petclinic.springmvcpractice.model.Owner;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface OwnerRepository extends JpaRepository<Owner, Long> {

    @EntityGraph(attributePaths = {"pets", "pets.type"})
    List<Owner> findAllByLastNameLike(String lastname);

    @EntityGraph(attributePaths = {"pets","pets.type"})
    Optional<Owner> findById(Long id);
}
