package dev.inmemorydatabase.demo.status;

import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StatusRepository {

    private final JdbcClient jdbcClient;

    public StatusRepository(JdbcClient jdbcClient) {
        this.jdbcClient = jdbcClient;
    }


    public List<Status> findAll(){
        return jdbcClient
                .sql("SELECT * FROM status")
                .query(Status.class)
                .list();

    }




}
