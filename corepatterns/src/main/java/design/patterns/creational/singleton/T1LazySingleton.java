package design.patterns.creational.singleton;

/**
 * Created by geely
 */
public class T1LazySingleton implements Runnable {
    @Override
    public void run() {
        LazySingleton instance = LazySingleton.getInstance();

        System.out.println(Thread.currentThread().getName()+"  "+instance);

    }
}
