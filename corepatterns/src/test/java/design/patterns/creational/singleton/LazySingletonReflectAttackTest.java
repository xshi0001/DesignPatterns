package design.patterns.creational.singleton;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @Description:
 * @Author: JClearLove
 * @Date: 2020/03/24 14:10
 */
public class LazySingletonReflectAttackTest {

    @Test
    public void getInstance() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<LazySingleton> lazySingletonClass = LazySingleton.class;
        Constructor<LazySingleton> declaredConstructor = lazySingletonClass.getDeclaredConstructor();

        declaredConstructor.setAccessible(true);

        //  和1与2的顺序有关，先1后2，即先反射再通过类.getInstance，正常，先2在1，就不行
        // 1
        LazySingleton newInstance = declaredConstructor.newInstance();
        // 2
        LazySingleton instance = LazySingleton.getInstance();
        // 多线程的话，就要看每一个线程的快慢了


           // 检查是否相等  implements Serializable
        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance == newInstance);


    }


}