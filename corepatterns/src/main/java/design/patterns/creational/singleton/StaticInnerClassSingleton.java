package design.patterns.creational.singleton;

/**
 * Created by geely
 * <p>
 * Class对象初始化锁
 * 基于类初始化的延迟加载解决懒汉式单例模式线程安全与性能问题，
 * 线程2看不到线程1的 步骤2,3重排序
 *
 * 哪些情况会导致类立刻被初始化？
 *
 */
public class StaticInnerClassSingleton {
    private static class InnerClass {
        private static StaticInnerClassSingleton staticInnerClassSingleton = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance() {
        return InnerClass.staticInnerClassSingleton;
    }

    private StaticInnerClassSingleton() {
        if (InnerClass.staticInnerClassSingleton != null) {
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }


}
