package ioc2.beans;


import ioc1.BeanDefinition;
import ioc2.exception.BeanException;

public interface BeanFactory {

    Object getBean(String beanName) throws BeanException;

    void registerBeanDefinition(BeanDefinition beanDefinition);
}
