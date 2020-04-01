package design.patterns.creational.singleton;

/**
 * @program: designpatterns
 * @description: 用于测试 基于容器单例
 * @author: JClearLove
 * @Date: 2020/03/24 19:45
 */
public class T5ContainerSingleton implements Runnable {

    @Override
    public void run() {
        // 存入对象
        ContainerSingleton.putInstance("object", Object.class);
        // 获取对象
        Object instance = ContainerSingleton.getInstance("object");
        System.out.println(Thread.currentThread().getName() + " " + instance);
    }
}

