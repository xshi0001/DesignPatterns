package design.patterns.creational.singleton;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

import static org.junit.Assert.*;

/**
 * @Description:
 * @Author: JClearLove
 * @Date: 2020/03/24 14:30
 */
public class LaySingletonReflectTest {

    @Test
    public void getInstance() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        Class<LaySingletonReflect> laySingletonReflectClass = LaySingletonReflect.class;
        Constructor<LaySingletonReflect> declaredConstructor = laySingletonReflectClass.getDeclaredConstructor();

        declaredConstructor.setAccessible(true);
        // 通过类直接获取
        LaySingletonReflect instance = LaySingletonReflect.getInstance();

        // 通过反射获取flag的值，然后修改值
        Field flag = instance.getClass().getDeclaredField("flag");
        flag.setAccessible(true);
        flag.set(instance,true);
        // 通过反射获取
        LaySingletonReflect newInstance = declaredConstructor.newInstance();

        // 检查是否相等  implements Serializable
        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance == newInstance);


    }

}