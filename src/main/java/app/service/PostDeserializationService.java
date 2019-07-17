package app.service;

import app.dto.Parameters;
import org.springframework.stereotype.Service;


public interface PostDeserializationService {
    void postProcess(Parameters parameters);
}
