package ioc3.event;

import java.util.EventObject;

/**
 * weiwei
 * 2023/4/14
 */
public class ApplicationEvent extends EventObject {
    private static final long serialVersionUID = 1L;

    public ApplicationEvent(Object arg0) {
        super(arg0);
    }
}
