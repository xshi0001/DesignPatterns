package design.patterns.creational.builder.decorationdemo;

import java.awt.*;
import java.net.URL;
import javax.swing.*;

/**
 * @program: designpatterns
 * @description: 产品：客厅
 * @author: JClearLove
 * @Date: 2020/03/23 15:44
 */
public class Parlour {
    /**
     * 墙
     */
    private String wall;

    /**
     * 电视
     */
    private String tv;
    /**
     * 沙发
     */
    private String sofa;

    public String getWall() {
        return wall;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    public String getTv() {
        return tv;
    }

    public void setTv(String tv) {
        this.tv = tv;
    }

    public String getSofa() {
        return sofa;
    }

    public void setSofa(String sofa) {
        this.sofa = sofa;
    }

    /**
     * 可以将装修效果图显示出来
     */
    public void show() {
        JFrame jf = new JFrame("建造者模式测试");
        Container contentPane = jf.getContentPane();
        JPanel p = new JPanel();
        JScrollPane sp = new JScrollPane(p);
        String parlour = wall + tv + sofa;
        URL url = Parlour.class.getClassLoader().getResource(parlour + ".png");
        JLabel l = new JLabel(new ImageIcon(url));
        p.setLayout(new GridLayout(1, 1));
        p.setBorder(BorderFactory.createTitledBorder("客厅"));
        p.add(l);
        contentPane.add(sp, BorderLayout.CENTER);
        jf.pack();
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

