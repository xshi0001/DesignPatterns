package design.patterns.creational.singleton;

import java.io.Serializable;

/**
 * Created by geely
 * 饿汉
 * 类加载的时候就完成初始化，写法简单，避免线程同步问题
 *
 *
 */
public class HungrySingleton implements Serializable{

    /**
     *  final必须在类加载的时候赋值，可以在静态块中初始化
     */
    private final static HungrySingleton hungrySingleton;

    static {
        // 静态加载块 ，类初始化加载，很饿一上来就要初始化化，
        // 懒汉是不用的时候不需要初始化，需要的时候才初始化
        hungrySingleton = new HungrySingleton();
    }

    private HungrySingleton() {
        if (hungrySingleton != null) {
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }

    /**
     * 单例设计模式-序列化破坏单例模式源码解析及解决方案
     * @return
     */
    private Object readResolve() {
        return hungrySingleton;
    }


}
