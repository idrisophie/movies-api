package dev.idrisophie.demo;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = "dev.idrisophie.demo")
public class MongoConfig extends AbstractMongoClientConfiguration {

    @Override
    protected String getDatabaseName() {
        return "movie-api-db";
    }

    @Override
    public MongoClient mongoClient() {
        return MongoClients.create("mongodb+srv://idrisophie:KeB3v64OEz7Q2p0R@cluster0.sebtnfo.mongodb.net/movie-api-db");
    }
}
