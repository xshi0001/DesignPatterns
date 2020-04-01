package design.patterns.creational.singleton;

/**
 * @program: designpatterns
 * @description: 线程锁-比较耗性能
 * @author: JClearLove
 * @Date: 2020/03/24 09:15
 */
public class T2LazySingletonUseSynchronized implements Runnable {


    @Override
    public void run() {

        // 加了同步锁
        LazySingletonUseSynchronized lazySingletonUseSynchronized = LazySingletonUseSynchronized.getInstance();
        System.out.println(Thread.currentThread().getName() + "  " + lazySingletonUseSynchronized);

    }
}

