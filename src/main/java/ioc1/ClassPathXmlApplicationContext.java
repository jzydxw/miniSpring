package ioc1;

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
 */
public class ClassPathXmlApplicationContext {

    private List<BeanDefinition> beanDefinitions = new ArrayList<>();
    private Map<String, Object> singletons = new HashMap<>();

    //构造器获取外部配置，解析出Bean的定义，形成内存映像
    public ClassPathXmlApplicationContext(String fileName) {
        this.readXml(fileName);
        this.instanceBeans();
    }

    // 读取XML文件内容
    private void readXml(String fileName) {
        SAXReader saxReader = new SAXReader();
        try {
            Class<? extends ClassPathXmlApplicationContext> aClass = this.getClass();
            ClassLoader classLoader = aClass.getClassLoader();
            URL xmlPath = classLoader.getResource(fileName);
            Document document = saxReader.read(xmlPath);
            Element rootElement = document.getRootElement();
            for (Element element: (List<Element>) rootElement.elements()) {
                // get beanDefinition from xml
                String beanId = element.attributeValue("id");
                String beanClassName = element.attributeValue("class");
                // save beanDefinition to list
                BeanDefinition beanDefinition = new BeanDefinition(beanId, beanClassName);
                beanDefinitions.add(beanDefinition);
            }

        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }

    private void instanceBeans() {
        // 反射创建bean，放在单例列表中
        for (BeanDefinition beanDefinition : beanDefinitions) {
            try {
                singletons.put(beanDefinition.getId(), Class.forName(beanDefinition.getClassName()).newInstance());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public Object getBean(String beanName) {
        return singletons.get(beanName);
    }


}
