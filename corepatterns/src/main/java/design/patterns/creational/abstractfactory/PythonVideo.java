package design.patterns.creational.abstractfactory;

/**
 * Created by geely
 * 具体产品
 */
public class PythonVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制Python课程视频");
    }
}
