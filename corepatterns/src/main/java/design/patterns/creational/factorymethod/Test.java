package design.patterns.creational.factorymethod;

/**
 * Created by geely
 *
 *  新的类型的video 要分别extend Video 和  VideoFactory，其他的代码不需要修改
 *
 *  对扩展开发，对修改关闭
 *
 *  产品对应产品
 *
 *  创建者对应创建者
 *
 */
public class Test {
    public static void main(String[] args) {
        //  应用层-创建java课程
        JavaVideoFactory javaVideoFactory = new JavaVideoFactory();
        Video video = javaVideoFactory.getVideo();
        video.produce();

    }

}
