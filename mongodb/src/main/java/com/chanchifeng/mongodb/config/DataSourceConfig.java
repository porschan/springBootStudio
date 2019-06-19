package com.chanchifeng.mongodb.config;

import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.ArrayList;
import java.util.List;

@Configuration
@PropertySource({"classpath:data-source.properties"})
@EnableMongoRepositories(basePackages = "com.chanchifeng.mongodb.repositories")
public class DataSourceConfig extends AbstractMongoConfiguration {

    @Autowired
    private Environment env;

    @Override
    @Bean
    public MongoClient mongoClient() {
        ServerAddress serverAddress = new ServerAddress(env.getRequiredProperty("mongo.host"));
        List<MongoCredential> credentials = new ArrayList<>();
        return new MongoClient(serverAddress, credentials);
    }

    @Override
    protected String getDatabaseName() {
        return env.getRequiredProperty("mongo.name");
    }
}
