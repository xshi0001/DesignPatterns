package design.patterns.structural.flyweight.game;

import java.awt.*;

//具体享元角色：白子
class WhitePieces implements ChessPieces {
    @Override
    public void downPieces(Graphics g, Point pt) {
        g.setColor(Color.WHITE);
        g.fillOval(pt.x, pt.y, 30, 30);
    }
}