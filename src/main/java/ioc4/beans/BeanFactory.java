package ioc4.beans;


import ioc2.exception.BeanException;

public interface BeanFactory {

    Object getBean(String beanName) throws BeanException;
    Boolean containsBean(String name);
    void registerBean(String beanName, Object object);
    boolean isSingleton(String name);
    boolean isPrototype(String name);
    Class<?> getType(String name);
}
