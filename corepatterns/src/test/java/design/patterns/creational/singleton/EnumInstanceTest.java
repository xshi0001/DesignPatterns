package design.patterns.creational.singleton;

import org.junit.Test;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import static org.junit.Assert.*;

/**
 * @Description:
 * @Author: JClearLove
 * @Date: 2020/03/24 14:51
 */
public class EnumInstanceTest {

    @Test
    public void getInstance() throws IOException, ClassNotFoundException {
        EnumInstance instance = EnumInstance.getInstance();
        instance.setData(new Object());

        // 写文件-序列化
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton_file"));
        oos.writeObject(instance);

        // 读文件-反序列化
        File file = new File("singleton_file");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));


        EnumInstance newInstance = (EnumInstance) ois.readObject();


        // 检查是否相等  implements Serializable
        System.out.println(instance.getData());
        System.out.println(newInstance.getData());

        System.out.println(instance.getData() == newInstance.getData());


    }


}