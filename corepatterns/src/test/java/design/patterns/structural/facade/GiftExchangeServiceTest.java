package design.patterns.structural.facade;

import design.patterns.creational.singleton.T5ContainerSingleton;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Description:
 * @Author: JClearLove
 * @Date: 2020/03/24 22:54
 */
public class GiftExchangeServiceTest {
    @Test
    public void Gift() {
        // 礼品子系统
        PointsGift pointsGift = new PointsGift("T恤");
        // 礼品积分兑换服务
        GiftExchangeService giftExchangeService = new GiftExchangeService();
        // 积分支付子系统
        PointsPaymentService pointsPaymentService = new PointsPaymentService();
        // 积分资格校验子系统
        QualifyService qualifyService = new QualifyService();
        // 物流子系统
        ShippingService shippingService = new ShippingService();
        giftExchangeService.setShippingService(shippingService);
        giftExchangeService.setPointsPaymentService(pointsPaymentService);
        giftExchangeService.setQualifyService(qualifyService);
        giftExchangeService.giftExchange(pointsGift);


        System.out.println("结论：\n各个子系统都暴露给外部调用，不好！\n");


    }

}