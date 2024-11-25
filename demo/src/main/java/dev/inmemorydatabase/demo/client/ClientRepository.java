package dev.inmemorydatabase.demo.client;

import dev.inmemorydatabase.demo.organization.Organization;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ClientRepository {

    private final JdbcClient jdbcClient;

    public ClientRepository(JdbcClient jdbcClient) {
        this.jdbcClient = jdbcClient;
    }



    List<Client> findAll(){

        return jdbcClient
                .sql("SELECT * FROM client c INNER JOIN organization o ON o.organization_id = c.fk_organization_id")
                .query((rs, rowNumber) ->{

                    Client client = new Client();
                    client.setClientId(rs.getInt("client_id"));
                    client.setClientName(rs.getString("client_name"));

                    Organization organization = new Organization();
                    organization.setOrganizationId(rs.getInt("organization_id"));
                    organization.setOrganizationName(rs.getString("organization_name"));


                    client.setOrganization(organization);

                    return client;


                })
                .list();
    }



}
