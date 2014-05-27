package br.com.btoffoli.canvasObjects

import javax.swing.*
import java.awt.*

/**
 * Created with IntelliJ IDEA.
 * User: btoffoli
 * Date: 5/19/14
 * Time: 11:51 PM
 * To change this template use File | Settings | File Templates.
 */
class PointCanvas extends Canvas {

    int x = 30

    int y = 30

    PointCanvas(int x, int y) {
        this.x = x
        this.y = y
    }

    @Override
    void paint(Graphics g) {
        graphics.setColor(Color.black);
        graphics.fillRect(x, y, 10, 10);
    }

}
