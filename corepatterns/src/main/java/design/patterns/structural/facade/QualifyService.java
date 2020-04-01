package design.patterns.structural.facade;

/**
 * 资格校验子系统
 * @author xshi0
 */
public class QualifyService {
    public boolean isAvailable(PointsGift pointsGift){
        System.out.println("校验"+pointsGift.getName()+" 积分资格通过,库存通过");
        return true;
    }
}