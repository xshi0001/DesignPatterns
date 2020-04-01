package design.patterns.creational.singleton;


import org.junit.Test;

/**
 * @Description:
 * @Author: JClearLove
 * @Date: 2020/03/24 11:09
 */
public class LazyDoubleCheckSingletonTest {

    @Test
    public void testThreadSecurityOfLazyDoubleCheckSingleton() {
        Thread t1 = new Thread(new T3LazyDoubleCheckSingleton());
        Thread t2 = new Thread(new T3LazyDoubleCheckSingleton());
        t1.start();
        t2.start();
        System.out.println("program end");

    }

}