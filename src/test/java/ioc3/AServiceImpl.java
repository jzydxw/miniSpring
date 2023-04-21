package ioc3;

import ioc1.Student;

/**
 * weiwei
 * 2023/4/14
 */
public class AServiceImpl implements AService {

    private String property1;
    private int level;
    private Student ref1;

    public AServiceImpl(String property1, int level) {
        this.property1 = property1;
        this.level = level;
    }

    @Override
    public void sayHello() {
        System.out.println("hello world");
    }
}
