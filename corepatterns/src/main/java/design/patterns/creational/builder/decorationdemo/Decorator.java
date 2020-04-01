package design.patterns.creational.builder.decorationdemo;

/**
 * @program: designpatterns
 * @description: 抽象建筑者：装修工人
 * @author: JClearLove
 * @Date: 2020/03/23 15:48
 */
public abstract class Decorator {

    protected Parlour product = new Parlour();

    public abstract void buildWall();

    public abstract void buildTv();

    public abstract void buildSofa();

    public  Parlour getResult(){

        return product;


    }

}

