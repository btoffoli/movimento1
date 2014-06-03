package br.com.btoffoli.canvasObjects

import javax.swing.ImageIcon
import java.awt.Canvas
import java.awt.Color
import java.awt.Graphics
import java.awt.Image

/**
 * Created with IntelliJ IDEA.
 * User: btoffoli
 * Date: 5/19/14
 * Time: 11:51 PM
 * To change this template use File | Settings | File Templates.
 */
class PacmanCanvas extends Canvas {

    int x = 30

    int y = 30

    Image image




    @Override
    void paint(Graphics g) {
        buildPacman(g)
    }

    private void buildPacman(Graphics g) {

        //ImageIcon imageIcon = new ImageIcon('src/resource/images/pacman.png')
        //image = imageIcon.image
        //g.drawImage(image, x, y, this)

        graphics.setColor(Color.red)
        graphics.drawRect(x, y, 50, 50)
        graphics.fillRect(x, y, 50, 50)
        graphics.setClip(x, y, 50, 50)
    }

}
