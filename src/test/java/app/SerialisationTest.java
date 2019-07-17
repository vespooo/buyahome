package app;

import app.dto.Parameters;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.awt.*;

import java.io.IOException;
@RunWith(SpringRunner.class)
@JsonTest
public class SerialisationTest {
    @Autowired
    private ObjectMapper objectMapper;

    Logger logger = LoggerFactory.getLogger(this.getClass());

  @Test
    public void absentAttributesShouldInstantiate() throws IOException {
        String json = "{\"rent\":null,\"mortgage\":null,\"date\":null}";
        Parameters params = objectMapper.readValue(json, Parameters.class);
        logger.info(params.toString());
        Assert.assertNotNull(params.getHome());
    }

    @Test
    public void attributesShouldBeMappedCorrectly() throws IOException {
        String json = "{\"home\": {\"price\":1}, \"rent\":null,\"mortgage\":null,\"date\":null}";
        Parameters params = objectMapper.readValue(json, Parameters.class);
        logger.info(params.toString());
        Assert.assertEquals(1, (int) params.getHome().getPrice());
    }
}
