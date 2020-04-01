package design.patterns.structural.decorator.demo;

/**
 * @program: designpatterns
 * @description:
 * @author: JClearLove
 * @Date: 2020/03/25 11:36
 */
public class Test {
    public static void main(String[] args) {
        Morrigan m0 = new original();
        m0.display();

        Succubus m1 = new Succubus(m0);
        m1.display();

        Girl m2 = new Girl(m0);

        m2.display();


    }

}

