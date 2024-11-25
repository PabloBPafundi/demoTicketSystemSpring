package dev.inmemorydatabase.demo.ticket;

import dev.inmemorydatabase.demo.client.Client;
import dev.inmemorydatabase.demo.organization.Organization;
import dev.inmemorydatabase.demo.status.Status;

public class Ticket {

    //private Integer statusId;
    //private Integer organizationId;
    // private Integer clientId
    private Integer ticketId;
    private String ticketTitle;
    private String ticketDescription;
    private Status status;
    private Organization organization;
    private Client client;


    public Ticket(){}

    public Ticket(Client client, Organization organization, Status status, String ticketDescription, String ticketTitle, Integer ticketId) {
        this.client = client;
        this.organization = organization;
        this.status = status;
        this.ticketDescription = ticketDescription;
        this.ticketTitle = ticketTitle;
        this.ticketId = ticketId;
    }


    public Integer getTicketId() {
        return ticketId;
    }

    public void setTicketId(Integer ticketId) {
        this.ticketId = ticketId;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getTicketDescription() {
        return ticketDescription;
    }

    public void setTicketDescription(String ticketDescription) {
        this.ticketDescription = ticketDescription;
    }

    public String getTicketTitle() {
        return ticketTitle;
    }

    public void setTicketTitle(String ticketTitle) {
        this.ticketTitle = ticketTitle;
    }
}
