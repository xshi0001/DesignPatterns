package design.patterns.creational.prototype.clone;

import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

/**
 * @Description:
 * @Author: JClearLove
 * @Date: 2020/03/24 21:15
 */
public class PigUseDeepCloneTest {
    @Test
    public void testCloneUseSupperMethod() throws CloneNotSupportedException {
        Date birthday = new Date(0L);
        PigUseDeepClone pig1 = new PigUseDeepClone("佩奇", birthday);
        PigUseDeepClone pig2 = (PigUseDeepClone) pig1.clone();
        System.out.println(pig1);
        System.out.println(pig2);

        // 只修改pig1的属性
        pig1.getBirthday().setTime(666666666L);

        // 观察两个猪是否相同，如果相同则是浅克隆
        System.out.println(pig1);
        System.out.println(pig2);


    }

}