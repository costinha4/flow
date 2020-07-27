package flow;

public interface App<T> {
  T in(IEvent event) throws AppException, EventException, ProtocolException, ActionException;
}
