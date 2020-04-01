package design.patterns.creational.abstractfactory;

/**
 * Created by geely
 * 具体产品
 */
public class PythonArticle extends Article {
    @Override
    public void produce() {
        System.out.println("编写Python课程手记");
    }
}
