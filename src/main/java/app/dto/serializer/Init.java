package app.dto.serializer;

import app.dto.serializer.initiator.Initiator;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
@Documented
public @interface Init {
    Class<? extends Initiator> initiator();
}
