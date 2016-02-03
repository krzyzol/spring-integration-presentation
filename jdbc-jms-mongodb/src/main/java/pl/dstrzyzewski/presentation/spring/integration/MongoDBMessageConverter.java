package pl.dstrzyzewski.presentation.spring.integration;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import org.springframework.core.convert.converter.Converter;

public class MongoDBMessageConverter implements Converter<Message, DBObject> {

    @Override
    public DBObject convert(final Message message) {
        final DBObject dbo = new BasicDBObject();
        dbo.put("_id", message.getId());
        dbo.put("text", message.getValue());
        return dbo;
    }

}
