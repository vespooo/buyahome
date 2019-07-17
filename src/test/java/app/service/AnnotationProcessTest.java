package app.service;

import app.dto.Parameters;
import app.dto.serializer.initiator.DefaultPrice;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AnnotationProcessTest {

    @Autowired
    PostDeserializationService service;

    @Test
    public void shouldProcess(){
        Parameters params = new Parameters();
        Integer price = new DefaultPrice().initiate();
        service.postProcess(params);
        System.out.println(params.toString());
        Assert.assertEquals(price, params.getHome().getPrice());
    }
}
