package design.patterns.creational.singleton;

/**
 * @program: designpatterns
 * @description: 懒汉式解决线程不安全：每个线程拿的instance有时候一致有时候不一致问题
 * @author: JClearLove
 * @Date: 2020/03/24 09:48
 */
public class LazySingletonUseSynchronized {
    private static LazySingletonUseSynchronized lazySingletonUseSynchronized = null;

    private LazySingletonUseSynchronized() {
    }

    /**
     * 锁静态方法，同步方法
     *
     * @return
     */
    public synchronized static LazySingletonUseSynchronized getInstance() {

        if (lazySingletonUseSynchronized == null) {
            lazySingletonUseSynchronized = new LazySingletonUseSynchronized();
        }
        return lazySingletonUseSynchronized;

    }

    /**
     * 锁类，效果一样
     * @return
     */
    public static LazySingletonUseSynchronized getInstance2() {
        synchronized (LazySingleton.class) {

            if (lazySingletonUseSynchronized == null) {
                lazySingletonUseSynchronized = new LazySingletonUseSynchronized();
            }
            return lazySingletonUseSynchronized;

        }


    }
}

