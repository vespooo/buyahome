package app.dto.serializer.initiator;

import app.dto.serializer.Init;
import org.springframework.stereotype.Component;

@Component
public class DefaultPrice implements Initiator<Integer> {


    @Override
    public Integer initiate() {
        return 3;
    }
}
