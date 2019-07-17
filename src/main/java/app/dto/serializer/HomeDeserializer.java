package app.dto.serializer;

import app.dto.Home;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;

import java.io.IOException;

public class HomeDeserializer extends JsonDeserializer<Home> {
    @Override
    public Home deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {

        return new Home();
    }

    @Override
    public Home getEmptyValue(DeserializationContext ctxt) throws JsonMappingException {
        return new Home();
    }
}
