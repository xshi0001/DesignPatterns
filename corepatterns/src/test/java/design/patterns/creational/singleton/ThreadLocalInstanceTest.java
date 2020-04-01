package design.patterns.creational.singleton;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Description:
 * @Author: JClearLove
 * @Date: 2020/03/24 20:04
 */
public class ThreadLocalInstanceTest {

    @Test
    public void getInstance() {
        System.out.println("main thread" + ThreadLocalInstance.getInstance());
        System.out.println("main thread" + ThreadLocalInstance.getInstance());
        System.out.println("main thread" + ThreadLocalInstance.getInstance());
        System.out.println("main thread" + ThreadLocalInstance.getInstance());
        System.out.println("main thread" + ThreadLocalInstance.getInstance());
        System.out.println("main thread" + ThreadLocalInstance.getInstance());

        Thread t1 = new Thread(new T6ThreadLocalInstance());
        Thread t2 = new Thread(new T6ThreadLocalInstance());
        t1.start();
        t2.start();

         System.out.println("threadLocal为每个线程提供独立的变量副本，基于ThreadLocalMap," +
                 "多个线程对数据的访问冲突" +
                 " 同步锁----时间换空间，"+
                 " threadlocal----空间换时间，");

    }
}