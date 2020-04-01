package design.patterns.creational.abstractfactory;

/**
 * Created by geely
 * 具体工厂
 */
public class JavaCourseFactory implements CourseFactory {
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }

    @Override
    public Article getArticle() {
        return new JavaArticle();
    }
}
