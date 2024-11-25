package dev.inmemorydatabase.demo.ticket;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/ticket")
public class TicketController {

    private final TicketRepository ticketRepository;


    public TicketController(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }


    @GetMapping("")
    List<Ticket> findAll(){
        return ticketRepository.findAll();
    }
}
