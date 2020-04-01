package design.patterns.structural.proxy.staticproxy;


import design.patterns.structural.proxy.IOrderService;
import design.patterns.structural.proxy.Order;
import design.patterns.structural.proxy.OrderServiceImpl;
import design.patterns.structural.proxy.db.DataSourceContextHolder;

/**
 * Created by geely
 */
public class OrderServiceStaticProxy {

    private IOrderService iOrderService;

    public int saveOrder(Order order) {

        beforeMethod(order);
        iOrderService = new OrderServiceImpl();
        int result = iOrderService.saveOrder(order);

        afterMethod();

        return result;
    }

    private void beforeMethod(Order order) {
        int userId = order.getUserId();
        int dbRouter = userId % 2;
        System.out.println("静态代理分配到【db" + dbRouter + "】处理数据");

        //todo 设置dataSource;
        DataSourceContextHolder.setDBType("db" + String.valueOf(dbRouter));
        System.out.println("静态代理 before code");
    }

    private void afterMethod() {
        System.out.println("静态代理 after code");
    }
}
