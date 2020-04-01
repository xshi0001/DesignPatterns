package design.patterns.creational.singleton;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @Description:
 *  添加防御代码
 *  private StaticInnerClassSingleton() {
 *         if (InnerClass.staticInnerClassSingleton != null) {
 *             throw new RuntimeException("单例构造器禁止反射调用");
 *         }
 *     }
 *
 * @Author: JClearLove
 * @Date: 2020/03/24 14:00
 */
public class StaticInnerClassSingletonReflectAttackTest {
    @Test
    public void getInstance() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<StaticInnerClassSingleton> staticInnerClassSingletonClass = StaticInnerClassSingleton.class;
        Constructor<StaticInnerClassSingleton> declaredConstructor = staticInnerClassSingletonClass.getDeclaredConstructor();

        declaredConstructor.setAccessible(true);

        StaticInnerClassSingleton instance = StaticInnerClassSingleton.getInstance();
        StaticInnerClassSingleton newInstance = declaredConstructor.newInstance();



        // 检查是否相等  implements Serializable
        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance == newInstance);

    }

}