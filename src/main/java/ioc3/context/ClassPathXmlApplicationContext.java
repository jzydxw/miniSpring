package ioc3.context;


import ioc2.exception.BeanException;
import ioc3.beans.BeanFactory;
import ioc3.beans.SimpleBeanFactory;
import ioc3.event.ApplicationEvent;
import ioc3.event.ApplicationEventPublisher;
import ioc3.resource.ClassPathXmlResource;
import ioc3.resource.Resource;
import ioc3.resource.XmlBeanDefinitionReader;

/**
 * weiwei
 * 2023/4/14
 *  // start up, read xml, explain bean, create factory
 */
public class ClassPathXmlApplicationContext implements BeanFactory, ApplicationEventPublisher {

    BeanFactory beanFactory;

    public ClassPathXmlApplicationContext(String fileName) {
        Resource resource = new ClassPathXmlResource(fileName);
        BeanFactory beanFactory = new SimpleBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader((SimpleBeanFactory) beanFactory);
        reader.loanBeanDefinition(resource);
        this.beanFactory = beanFactory;
    }

    @Override
    public void registerBean(String beanName, Object obj) {
        this.beanFactory.registerBean(beanName, obj);
    }

    @Override
    public boolean isSingleton(String name) {
        return false;
    }

    @Override
    public boolean isPrototype(String name) {
        return false;
    }

    @Override
    public Class<?> getType(String name) {
        return null;
    }

    @Override
    public Object getBean(String beanName) throws BeanException {
        return this.beanFactory.getBean(beanName);
    }

    public Boolean containsBean(String name) {
        return this.beanFactory.containsBean(name);
    }


    @Override
    public void publishEvent(ApplicationEvent event) {

    }
}
