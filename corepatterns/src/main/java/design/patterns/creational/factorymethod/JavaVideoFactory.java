package design.patterns.creational.factorymethod;


/**
 * @program: designpatterns
 * @description:
 * @author: JClearLove
 * @Date: 2020/03/23 12:48
 */
public class JavaVideoFactory extends VideoFactory {


    /**
     * 接口和抽象类都可以使用
     *
     * @return
     */
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }
}

