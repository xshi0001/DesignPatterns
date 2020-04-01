package design.patterns.structural.flyweight.demo2;

//抽象享元角色
interface Flyweight {
    void operation(UnsharedConcreteFlyweight state);
}