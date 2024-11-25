package dev.inmemorydatabase.demo.organization;

import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class OrganizationRepository {


    private final JdbcClient jdbcClient;

    public OrganizationRepository(JdbcClient jdbcClient) {
        this.jdbcClient = jdbcClient;
    }

    public List<Organization> findAll(){
        return jdbcClient
                .sql("SELECT * FROM organization")
                .query(Organization.class)
                .list();

    }



}
