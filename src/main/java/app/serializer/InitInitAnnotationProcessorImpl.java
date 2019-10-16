package app.serializer;

import app.dto.MyComponent;
import app.serializer.initiator.Initiator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;
import java.util.Arrays;

@Component
public class InitInitAnnotationProcessorImpl implements InitAnnotationProcessor {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    ApplicationContext appContext;


    public void process(Object object) {
        initiate(object.getClass().getDeclaredFields(), object);
    }

    private void initiate(Field[] fields, Object parentObj) {
        Arrays.stream(fields)
                .forEach(f -> {
                    try {
                        f.setAccessible(true);
                        Object fieldObj = f.get(parentObj);

                        if (f.isAnnotationPresent(Init.class)) {
                            Class<? extends Initiator> initiator = f.getAnnotation(Init.class).initiator();
                            //fieldObj = initiator.newInstance().initiate(fieldObj);
                            fieldObj = appContext.getBean(initiator).initiate(fieldObj);
                            f.set(parentObj, fieldObj);
                        }

                        if( Arrays.asList(f.getType().getInterfaces()).contains(MyComponent.class)){
                            if (fieldObj == null){
                                fieldObj = f.getType().newInstance();
                                f.set(parentObj, fieldObj);
                            }
                            initiate(f.getType().getDeclaredFields(), fieldObj);
                        }

                    } catch (IllegalAccessException | InstantiationException e) {
                        e.printStackTrace();
                    }
                });


    }
}
