package design.patterns.structural.facade;

/**
 * Created by geely
 * 物流相关的子系统
 * @author xshi0
 */
public class ShippingService {
    public String shipGift(PointsGift pointsGift) {
        //物流系统的对接逻辑
        System.out.println(pointsGift.getName() + "进入物流系统");
        String shippingOrderNo = "666";
        return shippingOrderNo;
    }
}
