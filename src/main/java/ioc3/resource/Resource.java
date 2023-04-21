package ioc3.resource;


public interface Resource extends Iterable<Object>{

    boolean hasNext();
    Object next();


}
