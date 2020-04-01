package design.patterns.structural.facade.modify;

import design.patterns.structural.facade.PointsGift;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Description:
 * @Author: JClearLove
 * @Date: 2020/03/24 23:07
 */
public class GiftExchangeServiceWithFacadeModeTest {
     @Test
    public void Gift() {
        // 礼品子系统
        PointsGift pointsGift = new PointsGift("T恤");
        // 礼品积分兑换服务
        GiftExchangeServiceWithFacadeMode giftExchangeService = new GiftExchangeServiceWithFacadeMode();

        giftExchangeService.giftExchange(pointsGift);


        System.out.println("结论：\n各个子系统在GiftExchangeServiceWithFacadeMode类中新建，不暴露给外界！\n");


    }

}