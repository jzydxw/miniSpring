package ioc2.resource;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.net.URL;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * weiwei
 * 2023/4/14
 */
public class ClassPathXmlResource implements Resource{
    Document document;
    Element rootElement;
    Iterator<Element> elementIterator;


    public ClassPathXmlResource(String fileName) {
        SAXReader saxReader = new SAXReader();
        URL xmlPath = this.getClass().getClassLoader().getResource(fileName);

        try {
            this.document = saxReader.read(xmlPath);
            this.rootElement = document.getRootElement();
            this.elementIterator = this.rootElement.elementIterator();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public boolean hasNext() {
        return this.elementIterator.hasNext();
    }

    public Object next() {
        return this.elementIterator.next();
    }



    @Override
    public Iterator<Object> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super Object> action) {
        Resource.super.forEach(action);
    }

    @Override
    public Spliterator<Object> spliterator() {
        return Resource.super.spliterator();
    }
}
