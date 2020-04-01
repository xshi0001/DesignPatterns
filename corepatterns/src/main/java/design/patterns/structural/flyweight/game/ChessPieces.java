package design.patterns.structural.flyweight.game;

import java.awt.*;

//抽象享元角色：棋子
interface ChessPieces {
    /**
     *  下子
     */
    void downPieces(Graphics g, Point pt);
}