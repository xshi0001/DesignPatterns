package design.patterns.creational.prototype.clone;

import java.io.Serializable;

/**
 * @program: designpatterns
 * @description:
 * @author: JClearLove
 * @Date: 2020/03/24 21:51
 */
public class HungrySingleTonModify implements Serializable,Cloneable {

      /**
     * final必须在类加载的时候赋值，可以在静态块中初始化
     */
    private final static HungrySingleTonModify hungrySingleton;

    static {
        // 静态加载块 ，类初始化加载，很饿一上来就要初始化化，
        // 懒汉是不用的时候不需要初始化，需要的时候才初始化
        hungrySingleton = new HungrySingleTonModify();
    }

    private HungrySingleTonModify() {
        if (hungrySingleton != null) {
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    public static HungrySingleTonModify getInstance() {
        return hungrySingleton;
    }

    /**
     * 单例设计模式-序列化破坏单例模式源码解析及解决方案
     *
     * @return
     */
    private Object readResolve() {
        return hungrySingleton;
    }

    /**
     *
     *  cloneable接口
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        // 重写为对象的实例,防止克隆破坏
        return getInstance();
    }

}

