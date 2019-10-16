package app.serializer.initiator;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DefaultPrice implements Initiator<Integer> {

    @Value("${init.home.price}")
    private Integer value;
    @Override
    public Integer initiate(Object initialObj) {
        return value;
    }
}
