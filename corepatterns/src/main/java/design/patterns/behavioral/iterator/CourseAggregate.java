package design.patterns.behavioral.iterator;

/**
 * Created by geely.
 */
public interface CourseAggregate {

    void addCourse(Course course);
    void removeCourse(Course course);

    CourseIterator getCourseIterator();



}
