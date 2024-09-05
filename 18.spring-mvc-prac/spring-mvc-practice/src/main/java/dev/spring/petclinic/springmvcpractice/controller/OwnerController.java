package dev.spring.petclinic.springmvcpractice.controller;

import dev.spring.petclinic.springmvcpractice.model.Owner;
import dev.spring.petclinic.springmvcpractice.model.Pet;
import dev.spring.petclinic.springmvcpractice.repository.PetsRepository;
import dev.spring.petclinic.springmvcpractice.service.OwnerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@Controller
@RequestMapping("/owners")
@RequiredArgsConstructor
public class OwnerController {

    private final OwnerService ownerService;

    @GetMapping("/find")
    public String find(Model model) {
        model.addAttribute("owner", Owner.builder().build());
        return "owners/findOwners";
    }

    @GetMapping
    public String processFindForm(@RequestParam String lastName, Model model) {
        List<Owner> listOwners=  ownerService.findAllByLastNameLike(lastName);
        model.addAttribute("listOwners", listOwners);
        System.out.println(listOwners);
        return "owners/ownersList";
    }

    @GetMapping("/{id}")
    public String getDetailById(@PathVariable Long id, Model model) {

        Owner owner= ownerService.findById(id);
        model.addAttribute("owner", owner);
        return "owners/ownerDetails";
    }
}
