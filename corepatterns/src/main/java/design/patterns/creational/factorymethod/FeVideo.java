package design.patterns.creational.factorymethod;

/**
 * @program: designpatterns
 * @description:
 *
 *  具体产品ConcreteProduct 实现了抽象产品角色所定义的接口，由具体工程来创建，他通具体工厂一一对应
 *
 * @author: JClearLove
 * @Date: 2020/03/23 12:57
 */
public class FeVideo extends Video {

    @Override
    public void produce() {
        System.out.println("录制Fe课程视频");
    }
}

