package design.patterns.creational.singleton;

/**
 * Created by geely
 * 懒汉式单例模式- 并不是类加载的时候就创建单例对象
 * <p>
 * LazySingleton 包含一个实例且能自行创建这个实例的类
 *
 * @author geely
 */
public class LazySingleton {

    /**
     *  类加载并没有初始化
     */
    private static LazySingleton lazySingleton = null;

    /**
     * 单例类只有一个实例对象；  private 禁止使用new LazySingleton(),实例化
     */
    private LazySingleton() {
         if (lazySingleton != null) {
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    /**
     * 只有调用getInstance的时候才生成单例对象
     * 单例类对外提供一个访问该单例的全局访问点；
     * synchronized +static method = synchronized+ LazySingleton.class
     *
     * @return
     */
    public static LazySingleton getInstance() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }


}
