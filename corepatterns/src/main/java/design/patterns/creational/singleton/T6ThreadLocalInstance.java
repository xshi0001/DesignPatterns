package design.patterns.creational.singleton;

/**
 * @program: designpatterns
 * @description:
 * @author: JClearLove
 * @Date: 2020/03/24 20:05
 */
public class T6ThreadLocalInstance implements Runnable {


    @Override
    public void run() {
        ThreadLocalInstance instance = ThreadLocalInstance.getInstance();
        System.out.println(Thread.currentThread().getName()+" "+instance);

    }
}

