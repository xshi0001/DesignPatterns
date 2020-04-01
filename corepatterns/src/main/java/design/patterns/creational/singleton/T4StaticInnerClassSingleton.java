package design.patterns.creational.singleton;

/**
 * @program: designpatterns
 * @description:
 * @author: JClearLove
 * @Date: 2020/03/24 11:31
 */
public class T4StaticInnerClassSingleton implements Runnable {

    @Override
    public void run() {

        StaticInnerClassSingleton instance = StaticInnerClassSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + "  " + instance);

    }
}

