package design.patterns.creational.singleton;

/**
 * @program: designpatterns
 * @description:
 * @author: JClearLove
 * @Date: 2020/03/24 14:23
 */
public class LaySingletonReflect {

    /**
     * 类加载并没有初始化
     */
    private static LaySingletonReflect laySingletonReflect = null;
    private static boolean flag = true;

    /**
     * 单例类只有一个实例对象；  private 禁止使用new LazySingleton(),实例化
     */

    private LaySingletonReflect() {
        // 是否是第一次创建？
        if (flag) {
            // 是，锁住
            flag = false;
        } else {
            // 否，抛出异常
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
    public static LaySingletonReflect getInstance() {
        if (laySingletonReflect == null) {
            laySingletonReflect = new LaySingletonReflect();
        }
        return laySingletonReflect;
    }


}

