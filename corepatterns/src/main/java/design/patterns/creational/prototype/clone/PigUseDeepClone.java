package design.patterns.creational.prototype.clone;

import java.util.Date;

/**
 * @program: designpatterns
 * @description:
 * @author: JClearLove
 * @Date: 2020/03/24 21:11
 */
public class PigUseDeepClone implements Cloneable{
     /**
     * 小猪佩奇的名字
     */
    private String name;
    /**
     *  生日
     */
    private Date birthday;

    public PigUseDeepClone(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        PigUseDeepClone deepClone = (PigUseDeepClone) super.clone();
        // 深克隆-单独克隆
       deepClone.birthday= (Date)deepClone.birthday.clone();
        return deepClone;
    }

    @Override
    public String toString() {
        return "Pig{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                '}'+super.toString();
    }

}

