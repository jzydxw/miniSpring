package ioc4.context;


import ioc2.exception.BeanException;
import ioc4.beans.BeanFactory;
import ioc4.beans.SimpleBeanFactory;
import ioc3.event.ApplicationEvent;
import ioc3.event.ApplicationEventPublisher;
import ioc4.resource.ClassPathXmlResource;
import ioc4.resource.Resource;
import ioc4.resource.XmlBeanDefinitionReader;

/**
 * weiwei
 * 2023/4/14
 *  // start up, read xml, explain bean, create factory
 */
public class ClassPathXmlApplicationContext implements BeanFactory, ApplicationEventPublisher {

    SimpleBeanFactory simpleBeanFactory;

    public ClassPathXmlApplicationContext(String fileName) {
        this(fileName, true);
    }

    public ClassPathXmlApplicationContext(String fileName, boolean isRefresh) {
        Resource resource = new ClassPathXmlResource(fileName);
        SimpleBeanFactory beanFactory = new SimpleBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader((SimpleBeanFactory) beanFactory);
        reader.loanBeanDefinition(resource);
        this.simpleBeanFactory = beanFactory;
        if (isRefresh) {
            this.simpleBeanFactory.refresh();
        }
    }

    @Override
    public void registerBean(String beanName, Object obj) {
        this.simpleBeanFactory.registerBean(beanName, obj);
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
        return this.simpleBeanFactory.getBean(beanName);
    }

    public Boolean containsBean(String name) {
        return this.simpleBeanFactory.containsBean(name);
    }


    @Override
    public void publishEvent(ApplicationEvent event) {

    }
}
