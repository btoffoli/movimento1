package br.com.btoffoli

import javax.swing.ImageIcon
import javax.swing.JFrame
import java.awt.BorderLayout
import java.awt.Canvas
import java.awt.Component
import java.awt.Graphics
import java.awt.Image
import java.awt.event.KeyEvent
import java.awt.event.KeyListener

//package main.groovy

/**
 * User: btoffoli
 */
class App extends JFrame implements KeyListener {

    private Canvas pacManCanvas = new PacManCanvas()
    private Component pacManComponent = null
    private int pacManPositionX = 30
    private int pacManPositionY = 30
    private final int stepSizePosition = 10


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
        addKeyListener(this)
        layout = new BorderLayout()
        setSize(800, 800)
        pacManComponent =  add('Center', pacManCanvas)
        title = 'Game'
        defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        locationRelativeTo = null
        visible = true

    }


    /**EVENTOS DE TECLADO**/
    @Override
    void keyTyped(KeyEvent e) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    void keyPressed(KeyEvent e) {
        if (e.keyCode == KeyEvent.VK_RIGHT){
            println 'DIREITA'
            pacManPositionX += stepSizePosition
        }


        if (e.keyCode == KeyEvent.VK_LEFT) {
            println 'ESQUERDA'
            pacManPositionX -= stepSizePosition
        }

        if (e.keyCode == KeyEvent.VK_DOWN) {
            println 'ABAIXO'
            pacManPositionY += stepSizePosition
        }

        if (e.keyCode == KeyEvent.VK_UP) {
            println 'ACIMA'
            pacManPositionY -= stepSizePosition
        }


        pacManComponent.setLocation(pacManPositionX, pacManPositionY)
        //println e.properties
    }

    @Override
    void keyReleased(KeyEvent e) {
        //To chan
    }







    private class PacManCanvas extends Canvas {

        int x = 30

        int y = 30

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
            //g.setColor(Color.BLACK)
//            File filePacman = new File('src/resource/images/pacman.png')

            buildPacman(g)



        }

        @Override
        void update(Graphics g) {
            //super.update(g)    //To change body of overridden methods use File | Settings | File Templates.
            imageUpdate(image, x, y, this)
        }

        private void buildPacman(Graphics g) {

            ImageIcon imageIcon = new ImageIcon('src/resource/images/pacman.png')
            image = imageIcon.image
            g.drawImage(image, x, y, this)
        }






    }
}


