package design.patterns.structural.adapter.demo;

/**
 * Created by geely
 * 被适配者
 */
public class AC220 {
    public int outputAC220V() {
        int output = 220;
        System.out.println("输出交流电" + output + "V");
        return output;
    }
}
