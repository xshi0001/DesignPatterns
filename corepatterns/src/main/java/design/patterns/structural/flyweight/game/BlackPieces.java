package design.patterns.structural.flyweight.game;

import java.awt.*;

//具体享元角色：黑子
class BlackPieces implements ChessPieces {
    @Override
    public void downPieces(Graphics g, Point pt) {
        g.setColor(Color.BLACK);
        g.fillOval(pt.x, pt.y, 30, 30);
    }
}