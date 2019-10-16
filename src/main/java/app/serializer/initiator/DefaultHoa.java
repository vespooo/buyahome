package app.serializer.initiator;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DefaultHoa implements Initiator<Integer> {

    @Value("${init.home.hoa}")
    private Integer value;

    @Override
    public Integer initiate(Object initialObj) {
        return value;
    }
}
