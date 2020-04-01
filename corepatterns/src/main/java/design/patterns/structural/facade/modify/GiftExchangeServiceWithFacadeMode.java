package design.patterns.structural.facade.modify;

import design.patterns.structural.facade.PointsGift;
import design.patterns.structural.facade.PointsPaymentService;
import design.patterns.structural.facade.QualifyService;
import design.patterns.structural.facade.ShippingService;

/**
 * @program: designpatterns
 * @description: 使用外观模式，优化积分兑换系统
 * @author: JClearLove
 * @Date: 2020/03/24 23:06
 */
public class GiftExchangeServiceWithFacadeMode {
    private QualifyService qualifyService = new QualifyService();
    private PointsPaymentService pointsPaymentService = new PointsPaymentService();
    private ShippingService shippingService = new ShippingService();

    /**
     * 对外的调用接口
     *
     * @param pointsGift
     */
    public void giftExchange(PointsGift pointsGift) {
        if (qualifyService.isAvailable(pointsGift)) {
            //资格校验通过
            if (pointsPaymentService.pay(pointsGift)) {
                //如果支付积分成功
                // 返回物流订单号
                String shippingOrderNo = shippingService.shipGift(pointsGift);
                System.out.println("物流系统下单成功,订单号是:" + shippingOrderNo);
            }
        }
    }

}

