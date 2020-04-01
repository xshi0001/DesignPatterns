package design.patterns.creational.singleton;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import static org.junit.Assert.*;

/**
 * @Description:
 *
 *   反射防御：
 *      private HungrySingleton() {
 *         if (hungrySingleton != null) {
 *             throw new RuntimeException("单例构造器禁止反射调用");
 *         }
 *     }
 *
 *
 * @Author: JClearLove
 * @Date: 2020/03/24 13:04
 */
public class HungrySingletonReflectAttackTest {

    @Test
    public void getInstance() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<HungrySingleton> hungrySingletonClass = HungrySingleton.class;
        Constructor<HungrySingleton> declaredConstructor = hungrySingletonClass.getDeclaredConstructor();

        declaredConstructor.setAccessible(true);

        HungrySingleton instance = HungrySingleton.getInstance();
        HungrySingleton hungrySingleton = declaredConstructor.newInstance();

          // 检查是否相等  implements Serializable
        System.out.println(instance);
        System.out.println(hungrySingleton);
        System.out.println(instance == hungrySingleton);


    }
}