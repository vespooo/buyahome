package app;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ValueInitialisationTest {

    @Value("${init.home.price}")
    private Integer price;

    @Test
    public void valueShouldBeInitialized(){
        System.out.println("price=" + price);
        Assert.assertNotNull(price);
        Assert.assertTrue(price>0);
    }
}
