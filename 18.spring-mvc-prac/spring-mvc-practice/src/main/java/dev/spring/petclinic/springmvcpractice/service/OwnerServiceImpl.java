package dev.spring.petclinic.springmvcpractice.service;

import dev.spring.petclinic.springmvcpractice.model.Owner;
import dev.spring.petclinic.springmvcpractice.repository.OwnerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OwnerServiceImpl implements OwnerService {
    private final OwnerRepository ownerRepository;
    @Override
    public List<Owner> findAllByLastNameLike(String lastName) {
        List<Owner> ownerList= ownerRepository.findAllByLastNameLike("%"+lastName+"%");
        System.out.println("ownerList = " + ownerList);
        return ownerList;
    }
    @Override
    public Owner findById(Long id) {
        return ownerRepository.findById(id).orElseThrow();
    }
}
