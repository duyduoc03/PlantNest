package com.example.plantnest.config;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

@Configuration
@RequiredArgsConstructor
@EnableJpaRepositories(basePackages = "com.example.plantnest.repository",
        entityManagerFactoryRef = "ConfigEntityManager",
        transactionManagerRef = "ConfigTransactionManager")
public class ConfigDatasource {
    @Autowired
    private Config config;

    @Primary
    @Bean
    public DataSource customerDataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(config.getCustomerDriver());
        dataSource.setUrl(config.getCustomerUrl());
        dataSource.setUsername(config.getCustomerUsername());
        dataSource.setPassword(config.getCustomerPassword());
        return dataSource;
    }

    @Primary
    @Bean("ConfigEntityManager")
    public LocalContainerEntityManagerFactoryBean customerEntityManger() {
        LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
        em.setDataSource(customerDataSource());
        em.setPackagesToScan(new String[]{"com.example.plantnest.entity"});
        HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
        em.setJpaVendorAdapter(adapter);
        Map<String, Object> properties = new HashMap<>();
        properties.put("hibernate.dialect", config.getCustomerDialect());
        em.setJpaPropertyMap(properties);
        return em;
    }

    @Primary
    @Bean("ConfigTransactionManager")
    public PlatformTransactionManager customerTransactionManager() {
        JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(customerEntityManger().getObject());
        return transactionManager;
    }

}
