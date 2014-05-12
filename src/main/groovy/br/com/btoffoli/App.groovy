package br.com.btoffoli

import javax.swing.ImageIcon
import javax.swing.JFrame
import java.awt.BorderLayout
import java.awt.Canvas
import java.awt.Color
import java.awt.Graphics
import java.awt.Image

//package main.groovy

/**
 * User: btoffoli
 */
class App extends JFrame {

    private Canvas myCanvas = new Canvas() {
        Image image

        @Override
        void paint(Graphics g) {
            //super.paint(g)    //To change body of overridden methods use File | Settings | File Templates.
//            g.drawOval(50, 50, 100, 100)
//            g.setColor(Color.YELLOW)
//            g.fillOval(50, 50, 100, 100)
//            g.setColor(Color.BLUE)
//            g.fillOval(52, 52, 30, 30)
//            g.fillOval(112, 52, 30, 30)
//            g.setColor(Color.RED)
//            g.fillRect(90, 112, 50, 50)
            //ImageIcon imageIcon = new ImageIcon('')
            g.setColor(Color.BLACK)
//            File filePacman = new File('src/resource/images/pacman.png')
            ImageIcon imageIcon = new ImageIcon('src/resource/images/pacman.png')
            Image image = imageIcon.image
            g.drawImage(image, 30, 30, this)


        }
    }

    static void main(String[] args){

//        JFrame frmMain = new JFrame();
//        frmMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frmMain.setSize(400, 400);
//
//        Canvas cnvs = new Canvas();
//        cnvs.setSize(400, 400);
//
//
//        frmMain.add(cnvs);
//        frmMain.setVisible(true);
//
//        Graphics g = cnvs.getGraphics() as Graphics;
//        //g.setColor(new Color(255, 0, 0));
//        g.setColor(Color.BLACK)
//        g.fillRect(200, 200, 100, 100)
//        cnvs.repaint()
        //g.drawRect(200, 200, 100, 100)
        //g.drawString("Hello", 200, 200);
        new App()

        println(new File('./').absolutePath)

    }

    App() {
        layout = new BorderLayout()
        setSize(800, 800)
        add('Center', myCanvas)
        title = 'Game'
        defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        locationRelativeTo = null
        visible = true

    }
}


