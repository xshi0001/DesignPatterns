package design.patterns.creational.singleton;

/**
 * @program: designpatterns
 * @description: DoubleCheck双重检查- 兼顾性能与线程安全
 * @author: JClearLove
 * @Date: 2020/03/24 11:12
 */
public class T3LazyDoubleCheckSingleton implements Runnable {

    @Override
    public void run() {

        LazyDoubleCheckSingleton lazyDoubleCheckSingleton = LazyDoubleCheckSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + "  " + lazyDoubleCheckSingleton);

    }
}

