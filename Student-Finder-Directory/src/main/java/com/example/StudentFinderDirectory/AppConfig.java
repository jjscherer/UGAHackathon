package com.example.StudentFinderDirectory;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;

import org.springframework.data.mongodb.core.MongoTemplate.*;
@Configuration
public class AppConfig {
    @Bean
    MongoClient mongoClient(){
        return MongoClients.create("mongodb://localhost:27017");
    }
    @Bean
    MongoTemplate mongoTemplate(MongoClient mongoClient) {
        return new MongoTemplate(mongoClient, "geospatial");
    }
}
