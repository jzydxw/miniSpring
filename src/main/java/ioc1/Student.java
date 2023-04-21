package ioc1;

/**
 * weiwei
 * 2023/4/11
 */
public class Student {

    private String id;
    private String className;

    // 构造器
    public Student(String id, String className) {
        this.id = id;
        this.className = className;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
