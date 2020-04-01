package design.patterns.creational.prototype.clone;

import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;

import static org.junit.Assert.*;

/**
 * @Description:
 * @Author: JClearLove
 * @Date: 2020/03/24 21:27
 */
public class HungrySingletonTest {

    @Test
    public void CloneAttactSingletonObject() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        HungrySingleton instance = HungrySingleton.getInstance();
        // 反射
        Method method = instance.getClass().getDeclaredMethod("clone");
        // 设置权限
        method.setAccessible(true);
        HungrySingleton newInstance = (HungrySingleton) method.invoke(instance);
        // 检查两个实例是否相同
        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println("结论：\n 克隆导致单例对象失效！");
    }

    @Test
    public void SolveCloneAttactSingletonObject() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        HungrySingleTonModify instance = HungrySingleTonModify.getInstance();
        // 反射
        Method method = instance.getClass().getDeclaredMethod("clone");
        // 设置权限
        method.setAccessible(true);
        HungrySingleTonModify newInstance = (HungrySingleTonModify) method.invoke(instance);
        // 检查两个实例是否相同
        System.out.println(instance);
        System.out.println(newInstance);

        System.out.println("结论：\n 克隆导致单例对象失效，重写clone方法返回实例对象，解决失效！");

    }


}