package ioc3.beans.values;

/**
 * weiwei
 * 2023/4/14
 */
public class PropertyValue {
    private String type;
    private Object value;
    private String name;

    public PropertyValue(String type, Object value, String name) {
        this.type = type;
        this.value = value;
        this.name = name;
    }

    public PropertyValue(Object value, String name) {
        this.value = value;
        this.name = name;
    }


    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
