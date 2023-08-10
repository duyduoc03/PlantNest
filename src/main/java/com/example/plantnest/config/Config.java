package com.example.plantnest.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import lombok.Data;

@Data
@Configuration
public class Config {
    @Value("${spring.datasource.customer.driver}")
    private String customerDriver;
    @Value("${spring.datasource.customer.url}")
    private String customerUrl ;
    @Value("${spring.datasource.customer.username}")
    private String customerUsername;
    @Value("${spring.datasource.customer.password}")
    private String customerPassword;
    @Value("${spring.datasource.customer.dialect}")
    private String customerDialect ;
    @Value("${spring.datasource.customer.showSql}")
    private String customerShowSql;
}
