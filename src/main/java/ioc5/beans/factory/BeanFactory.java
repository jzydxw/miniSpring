package ioc5.beans.factory;


import ioc2.exception.BeanException;

public interface BeanFactory {

    Object getBean(String beanName) throws BeanException, ClassNotFoundException;
    Boolean containsBean(String name);
    void registerBean(String beanName, Object object);
    boolean isSingleton(String name);
    boolean isPrototype(String name);
    Class<?> getType(String name);
}
