package dev.spring.petclinic.springmvcpractice.service;

import dev.spring.petclinic.springmvcpractice.model.Owner;

import java.util.List;

public interface OwnerService {
    List<Owner> findAllByLastNameLike(String lastName);
    Owner findById(Long id);
}
