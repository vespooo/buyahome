package app.service;


import app.dto.Parameters;
import app.dto.serializer.InitAnnotationProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostDeserializationServiceImpl implements PostDeserializationService {

    @Autowired
    InitAnnotationProcessor initAnnotationProcessor;
    @Override
    public void postProcess(Parameters parameters) {
        initAnnotationProcessor.process(parameters);
    }
}
