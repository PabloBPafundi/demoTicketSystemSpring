package dev.inmemorydatabase.demo.client;

import dev.inmemorydatabase.demo.organization.Organization;

public class Client {
    private Integer clientId;
    private String clientName;
    private Organization organization;


    public Client(){}

    public Client(Organization organization, String clientName, Integer clientId) {
        this.organization = organization;
        this.clientName = clientName;
        this.clientId = clientId;
    }


    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }
}
