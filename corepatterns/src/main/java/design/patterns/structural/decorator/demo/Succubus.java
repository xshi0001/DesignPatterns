package design.patterns.structural.decorator.demo;

/**
 * 具体装饰角色：女妖
 */
class Succubus extends Changer {
    public Succubus(Morrigan m) {
        super(m);
    }

    @Override
    public void display() {
        setChanger();
        super.display();
    }

    public void setChanger() {
        ((original) super.m).setImage("Morrigan1.jpg");
    }
}