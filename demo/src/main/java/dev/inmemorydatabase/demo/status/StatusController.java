package dev.inmemorydatabase.demo.status;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/status")
public class StatusController {

    private final StatusRepository statusRepository;

    public StatusController(StatusRepository statusRepository){
        this.statusRepository = statusRepository;

    }


    @GetMapping("")
    List<Status> findAll(){
        return statusRepository.findAll();
    }

}
