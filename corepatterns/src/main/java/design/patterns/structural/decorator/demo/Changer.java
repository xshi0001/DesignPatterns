package design.patterns.structural.decorator.demo;

/**
 * 抽象装饰角色：变形
 */
class Changer implements Morrigan {
    Morrigan m;

    public Changer(Morrigan m) {
        this.m = m;
    }

    @Override
    public void display() {
        m.display();
    }
}