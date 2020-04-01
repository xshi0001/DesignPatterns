package design.patterns.creational.abstractfactory;

/**
 * Created by geely
 * 具体产品
 */
public class JavaVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制Java课程视频");
    }
}
