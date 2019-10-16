package app.serializer.initiator;

public interface Initiator<T> {
    T initiate(Object initialObj);
}
