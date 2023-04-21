package ioc5.beans.factory.annotation;

import ioc2.exception.BeanException;
import ioc5.beans.factory.BeanPostProcessor;

/**
 * weiwei
 * 2023/4/21
 */
public class AutowiredAnnotationBeanPostProcessor implements BeanPostProcessor {


    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeanException {
        return null;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeanException {
        return null;
    }
}
