package ioc2.resource;


public interface Resource extends Iterable<Object>{

    boolean hasNext();
    Object next();


}
