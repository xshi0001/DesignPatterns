package design.patterns.creational.abstractfactory;

/**
 * Created by geely
 * 具体产品
 */
public class JavaArticle extends Article {
    @Override
    public void produce() {
        System.out.println("编写Java课程手记");
    }
}
