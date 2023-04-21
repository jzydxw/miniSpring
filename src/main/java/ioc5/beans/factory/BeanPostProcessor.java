package ioc5.beans.factory;

import ioc2.exception.BeanException;

/**
 * weiwei
 * 2023/4/21
 */
public interface BeanPostProcessor {

    Object postProcessBeforeInitialization(Object bean, String beanName) throws BeanException;

    Object postProcessAfterInitialization(Object bean, String beanName) throws BeanException;
}
