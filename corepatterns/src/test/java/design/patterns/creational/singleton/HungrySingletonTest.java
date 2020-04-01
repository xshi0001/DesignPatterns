package design.patterns.creational.singleton;

import org.junit.Test;

import java.io.*;

import static org.junit.Assert.*;

/**
 * @Description:
 * @Author: JClearLove
 * @Date: 2020/03/24 11:45
 */
public class HungrySingletonTest {

    @Test
    public void getInstance() throws IOException, ClassNotFoundException {
        HungrySingleton instance = HungrySingleton.getInstance();
        // 写文件
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton_file"));
        oos.writeObject(instance);

        // 读文件
        File file = new File("singleton_file");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        HungrySingleton newInstance = (HungrySingleton) ois.readObject();

        // 检查是否相等  implements Serializable
        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance == newInstance);




    }
}