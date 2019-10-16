package app.serializer;

import app.serializer.initiator.Initiator;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
@Documented
public @interface Init {
    Class<? extends Initiator> initiator();
}
