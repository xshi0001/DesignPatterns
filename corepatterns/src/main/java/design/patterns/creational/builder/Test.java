package design.patterns.creational.builder;

/**
 * Created by geely
 */
public class Test {
    public static void main(String[] args) {
        // 实际建造者，可以选择不同的builder，但是是同样的构建过程，只是不同表示罢了
        CourseBuilder courseBuilder = new CourseActualBuilder();
        // 课程管理
        Coach coach = new Coach();
        coach.setCourseBuilder(courseBuilder);
        //
        Course course = coach.makeCourse("Java设计模式精讲",
                "Java设计模式精讲PPT",
                "Java设计模式精讲视频",
                "Java设计模式精讲手记",
                "Java设计模式精讲问答");
        System.out.println(course);

    }
}
