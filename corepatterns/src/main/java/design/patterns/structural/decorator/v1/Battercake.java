package design.patterns.structural.decorator.v1;

/**
 * Created by geely
 * 煎饼类
 */
public class Battercake {
    /**
     * 权限设置，在子类中使用的话，可以用protected
     * @return
     */
    protected String getDesc(){
        return "煎饼";
    }
    protected int cost(){
        return 8;
    }

}
