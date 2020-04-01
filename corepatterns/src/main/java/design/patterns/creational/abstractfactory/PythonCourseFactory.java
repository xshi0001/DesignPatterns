package design.patterns.creational.abstractfactory;

/**
 * Created by geely
 * 具体工厂
 */
public class PythonCourseFactory implements CourseFactory {
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }

    @Override
    public Article getArticle() {
        return new PythonArticle();
    }
}
