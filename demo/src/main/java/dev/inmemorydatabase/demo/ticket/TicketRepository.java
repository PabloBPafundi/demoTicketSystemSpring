package dev.inmemorydatabase.demo.ticket;

import dev.inmemorydatabase.demo.client.Client;
import dev.inmemorydatabase.demo.organization.Organization;
import dev.inmemorydatabase.demo.status.Status;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TicketRepository {

    private final JdbcClient jdbcClient;


    public TicketRepository(JdbcClient jdbcClient) {
        this.jdbcClient = jdbcClient;
    }


public List<Ticket> findAll(){
    return jdbcClient
            .sql("SELECT * FROM ticket t INNER JOIN status s on s.status_id = t.fk_status_id INNER JOIN client c ON c.client_id = t.fk_client_id INNER JOIN organization orgTicket ON orgTicket.organization_id = t.fk_organization_id INNER JOIN organization orgClient ON orgClient .organization_id = c.fk_organization_id")
            .query( (rs,rowNum) -> {

                Ticket ticket = new Ticket();
                ticket.setTicketId(rs.getInt("ticket_id"));
                ticket.setTicketTitle(rs.getString("ticket_title"));
                ticket.setTicketDescription(rs.getString("ticket_description"));

                Organization organizationTicket = new Organization();
                organizationTicket.setOrganizationId(rs.getInt("organization_id"));
                organizationTicket.setOrganizationName(rs.getString("organization_name"));


                Organization organizationClient = new Organization();
                organizationClient.setOrganizationId(rs.getInt("organization_id"));
                organizationClient.setOrganizationName(rs.getString("organization_name"));


                Status status = new Status();
                status.setStatusId(rs.getInt("status_id"));
                status.setStatusName(rs.getString("status_name"));

                Client client = new Client();
                client.setClientId(rs.getInt("client_id"));
                client.setClientName(rs.getString("status_name"));
                client.setOrganization(organizationClient);


                ticket.setOrganization(organizationTicket);
                ticket.setStatus(status);
                ticket.setClient(client);
                return ticket;
            })
            .list();

}












/*
    public List<Ticket> findAll(){
        return jdbcClient
                .sql("SELECT * FROM ticket")
                .query(Ticket.class)
                .list();

    }
*/
/*
    public List<Ticket> findAllTwo(){
        return jdbcClient
                .sql("SELECT * FROM ticket")
                .query( (rs,rowNum) -> {

                    Ticket ticket = new Ticket();
                    ticket.setTicketId(rs.getInt("ticket_id"));
                    ticket.setTicketTitle(rs.getString("ticket_title"));
                    ticket.setTicketDescription(rs.getString("ticket_description"));
                    ticket.setStatusId(rs.getInt("fk_status_id"));
                    ticket.setOrganizationId(rs.getInt("fk_organization_id"));
                    ticket.setClientId(rs.getInt("fk_client_id"));
                return ticket;
                })
                .list();
                 }

*/


}
