package test;

import com.mongodb.MongoClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;

@Configuration
public class MongoDBConfiguration extends AbstractMongoConfiguration {
    @Override
    public MongoClient mongo(){
        return new MongoClient("127.0.0.1", 27017);
    }

    @Override
    protected String getDatabaseName(){
        return "SpringBoard";
    }
}
