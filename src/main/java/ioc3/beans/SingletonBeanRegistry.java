package ioc3.beans;

/**
 * weiwei
 * 2023/4/14
 */
public interface SingletonBeanRegistry {

    void registerSingleton(String beanName, Object singletonObject);
    Object getSingleton(String beanName);
    boolean containsSingleton(String beanName);
    String[] getSingletonNames();
}
