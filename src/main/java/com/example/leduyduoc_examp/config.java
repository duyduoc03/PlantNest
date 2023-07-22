package com.example.leduyduoc_examp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class config {
    @Value("${system.database.url}")
    public  String databaseUrl;

    @Value("${system.database.username}")
    public String databaseUsername;

    @Value("${system.database.password}")
    public String databasePassword;

    @Value("${system.database.driver}")
    public String databaseDriver;
}
