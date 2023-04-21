package ioc1;

/**
 * weiwei
 * 2023/4/14
 */
public class Test1 {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext  context = new ClassPathXmlApplicationContext("beans.xml");
        AService aService = (AService) context.getBean("aService");
        aService.sayHello();
    }
}
