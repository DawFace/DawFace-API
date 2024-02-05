package com.daw.face.configuration;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class ConnectionDB {
    private static final String DB_PASSWORD = System.getenv("DB_PASSWORD");
    private static final String DB_URL = System.getenv("DB_URL");
    private static final String DB_USER = System.getenv("DB_USER");

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