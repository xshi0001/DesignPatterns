package design.patterns.creational.abstractfactory;


/**
 * Created by geely
 * 抽象工厂， 能生产多个产品的工厂
 *
 */
public interface CourseFactory {
    Video getVideo();
    Article getArticle();

}
