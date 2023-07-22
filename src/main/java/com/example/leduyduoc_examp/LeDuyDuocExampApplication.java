package com.example.leduyduoc_examp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import javax.sql.DataSource;

@SpringBootApplication
public class LeDuyDuocExampApplication {

	@Autowired
	private config cf;
	public static void main(String[] args) {
		SpringApplication.run(LeDuyDuocExampApplication.class, args);
	}

	@Bean
	public DataSource getDataSource(){
		DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
		dataSourceBuilder.driverClassName(cf.databaseDriver);
		dataSourceBuilder.url(cf.databaseUrl);
		dataSourceBuilder.username(cf.databaseUsername);
		dataSourceBuilder.password(cf.databasePassword);
		return dataSourceBuilder.build();
	}

	@Bean
	public JdbcTemplate getJdbcTemplate(){
		return new JdbcTemplate(getDataSource());
	}

	@Bean
	public NamedParameterJdbcTemplate namedParameterJdbcTemplate() {
		return  new NamedParameterJdbcTemplate(getDataSource());
	}

}
