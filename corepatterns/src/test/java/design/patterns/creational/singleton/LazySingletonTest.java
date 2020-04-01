package design.patterns.creational.singleton;

import org.junit.Test;

/**
 * @Description:
 * @Author: JClearLove
 * @Date: 2020/03/24 09:12
 */
public class LazySingletonTest {
     @Test
    public void getInstanceNoSynchroized() {

        // 未加锁
        Thread t1 = new Thread(new T1LazySingleton());
        Thread t2 = new Thread(new T1LazySingleton());
        t1.start();
        t2.start();
        System.out.println("program end");

    }


    @Test
    public void getInstance() {

        // 加锁
        Thread t1 = new Thread(new T2LazySingletonUseSynchronized());
        Thread t2 = new Thread(new T2LazySingletonUseSynchronized());
        t1.start();
        t2.start();
        System.out.println("program end");

    }
}