package design.patterns.creational.singleton;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Description:
 * @Author: JClearLove
 * @Date: 2020/03/24 19:48
 */
public class ContainerSingletonTest {

    @Test
    public void testThreadSecurityOfContainerSingleton() {

        Thread t1 = new Thread(new T5ContainerSingleton());
        Thread t2 = new Thread(new T5ContainerSingleton());
        t1.start();
        t2.start();
        System.out.println("结论：中间存在隐患，虽然都是返回同一个对象，但是中间还是多次初始化操作\n");
        System.out.println("将hashMap 线程不安全-->hashTable 线程安全，可以解决，但是影响性能，有锁");

    }

}