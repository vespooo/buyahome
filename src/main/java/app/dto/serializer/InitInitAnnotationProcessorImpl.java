package app.dto.serializer;

import app.dto.MyComponent;
import app.dto.serializer.initiator.Initiator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

@Component
public class InitInitAnnotationProcessorImpl implements InitAnnotationProcessor {

    Logger logger = LoggerFactory.getLogger(this.getClass());


    public void process(Object object) {
        Class<?> clazz = object.getClass();
        Arrays.asList(clazz.getDeclaredFields()).stream()
                .filter(field -> field.isAnnotationPresent(Init.class))
                .forEach(f -> {
                    f.setAccessible(true);
                    Class<? extends Initiator> initiator = f.getAnnotation(Init.class).initiator();
                    try {
                        f.set(object, initiator.newInstance().initiate());
                    } catch (InstantiationException e) {

                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                    System.out.println(f.getClass() + "!!!Annotation");
                });

        for (Field f : clazz.getDeclaredFields()) {
            boolean isMyComponent = false;
            for (Class<?> i : f.getClass().getInterfaces()) {
                if (MyComponent.class.isAssignableFrom(i)) {
                    isMyComponent = true;
                    return;
                }
                ;
            }
            if (isMyComponent) {
                try {
                    f.setAccessible(true);
                    Object subObject = f.get(object);
                    if (subObject == null) {
                        f.set(object, f.getDeclaringClass().newInstance());
                    }
                    process(subObject);
                } catch (IllegalAccessException e) {
                    logger.error
                            (e.getMessage());
                    e.printStackTrace();
                } catch (InstantiationException e) {
                    e.printStackTrace();
                }
            }


        }
    }
}
