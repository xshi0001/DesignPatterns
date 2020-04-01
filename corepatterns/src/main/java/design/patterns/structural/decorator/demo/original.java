package design.patterns.structural.decorator.demo;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * 具体构件角色：原身
 */
class original extends JFrame implements Morrigan {
    private static final long serialVersionUID = 1L;
    private String t = "Morrigan0.jpg";

    public original() {
        super("《恶魔战士》中的莫莉卡·安斯兰");
    }

    public void setImage(String t) {
        this.t = t;
    }

    @Override
    public void display() {
        this.setLayout(new FlowLayout());
        URL url = original.class.getClassLoader().getResource(t);
        JLabel l1 = new JLabel(new ImageIcon(url));
        this.add(l1);
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}