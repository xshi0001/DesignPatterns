package design.patterns.creational.singleton;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Description:
 * @Author: JClearLove
 * @Date: 2020/03/24 11:34
 */
public class StaticInnerClassSingletonTest {

    /**
     *  线程安全测试
     */
    @Test
    public void getInstance() {
        Thread t1 = new Thread(new T4StaticInnerClassSingleton());
        Thread t2 = new Thread(new T4StaticInnerClassSingleton());
        t1.start();
        t2.start();
        System.out.println("program end");

    }
}