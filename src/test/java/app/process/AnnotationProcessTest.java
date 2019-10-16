package app.process;

import app.dto.Parameters;
import app.serializer.initiator.DefaultHoa;
import app.serializer.initiator.DefaultPrice;
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
    private PostDeserializationService service;

    @Autowired
    private DefaultPrice defaultPrice;

    @Autowired
    private DefaultHoa defaultHoa;


    @Test
    public void shouldProcessDefaultHomePrice(){
        Parameters params = new Parameters();
        Integer price = defaultPrice.initiate(null);
        service.postProcess(params);
        System.out.println(params.toString());
        Assert.assertEquals(price, params.getHome().getPrice());
    }

    @Test
    public void shouldProcessDefaultHomeHoa(){
        Parameters params = new Parameters();
        Integer price = defaultHoa.initiate(null);
        service.postProcess(params);
        System.out.println(params.toString());
        Assert.assertEquals(price, params.getHome().getHoa());
    }
}
