package com.writter.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@Configuration
public class BeansConfig {
    private final DataSource dataSource;

    public BeansConfig(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Bean
    JdbcTemplate template(){
        return new JdbcTemplate(dataSource);
    }
}
