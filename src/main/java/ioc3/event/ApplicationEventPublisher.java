package ioc3.event;

public interface ApplicationEventPublisher {

    void publishEvent(ApplicationEvent event);
}
