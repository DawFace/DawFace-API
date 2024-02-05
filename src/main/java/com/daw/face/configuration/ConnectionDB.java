package com.daw.face.configuration;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class ConnectionDB {
    private static final String DB_PASSWORD = System.getenv("PASSWORD");
    private static final String DB_URL = System.getenv("URL");
    private static final String DB_USER = System.getenv("USER");

    @Bean
    public DataSource getDatabase() {
        return DataSourceBuilder
                .create()
                .url(DB_URL)
                .username(DB_USER)
                .password(DB_PASSWORD)
                .build();
    }
}