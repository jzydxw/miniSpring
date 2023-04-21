package ioc2.context;

import ioc1.BeanDefinition;
import ioc2.beans.BeanFactory;
import ioc2.beans.SimpleBeanFactory;
import ioc2.exception.BeanException;
import ioc2.resource.ClassPathXmlResource;
import ioc2.resource.Resource;
import ioc2.resource.XmlBeanDefinitionReader;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * weiwei
 * 2023/4/14
 *  // start up, read xml, explain bean, create factory
 */
public class ClassPathXmlApplicationContext implements BeanFactory {

    BeanFactory beanFactory;

    public ClassPathXmlApplicationContext(String fileName) {
        Resource resource = new ClassPathXmlResource(fileName);
        BeanFactory beanFactory = new SimpleBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
        reader.loanBeanDefinition(resource);
        this.beanFactory = beanFactory;
    }

    @Override
    public void registerBeanDefinition(BeanDefinition beanDefinition) {
        this.beanFactory.registerBeanDefinition(beanDefinition);
    }

    @Override
    public Object getBean(String beanName) throws BeanException {
        return this.beanFactory.getBean(beanName);
    }








}
