package design.patterns.creational.singleton;

import org.junit.Test;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import static org.junit.Assert.*;

/**
 * @Description:
 * @Author: JClearLove
 * @Date: 2020/03/24 15:01
 */
public class EnumInstanceReflectTest {
    @Test
    public void getInstance() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        // 尝试使用枚举类来看看是否可用反射创建enum objcets
        Class<EnumInstance> enumInstanceClass = EnumInstance.class;

        Constructor<EnumInstance> declaredConstructor = enumInstanceClass.getDeclaredConstructor(String.class, int.class);
        declaredConstructor.setAccessible(true);

        // 报错，使用jad工具 jad EnumInstance.class 发现，enum类的加载使用类似StaticInnerClassSingleton 来初始化单例对象
        EnumInstance newInstance = declaredConstructor.newInstance();


    }


    @Test
    public void testMethodOfEnumInstance(){
        EnumInstance instance = EnumInstance.getInstance();
        // 调用枚举类的方法
        instance.printTest();

    }


}