package dev.inmemorydatabase.demo.organization;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/organization")
public class OrganizationController {

    private final OrganizationRepository organizationRepository;

    public OrganizationController(OrganizationRepository organizationRepository){
        this.organizationRepository = organizationRepository;
    }

    @GetMapping("")
    List<Organization> findAll(){
        return organizationRepository.findAll();

    }

}
