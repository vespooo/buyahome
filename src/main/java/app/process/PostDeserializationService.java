package app.process;

import app.dto.Parameters;


public interface PostDeserializationService {
    void postProcess(Parameters parameters);
}
