package ioc3.resource;

import ioc3.beans.BeanDefinition;
import ioc3.beans.SimpleBeanFactory;
import org.dom4j.Element;

/**
 * weiwei
 * 2023/4/14
 */
public class XmlBeanDefinitionReader {

    SimpleBeanFactory simpleBeanFactory;

    public XmlBeanDefinitionReader(SimpleBeanFactory simpleBeanFactory) {
        this.simpleBeanFactory = simpleBeanFactory;
    }

    public void loanBeanDefinition(Resource resource) {
        while (resource.hasNext()) {
            Element element = (Element) resource.next();
            // get beanDefinition from xml
            String beanId = element.attributeValue("id");
            String beanClassName = element.attributeValue("class");
            BeanDefinition beanDefinition = new BeanDefinition(beanId, beanClassName);
            this.simpleBeanFactory.registerBeanDefinition(beanDefinition.getId(), beanDefinition);
        }
    }
}
