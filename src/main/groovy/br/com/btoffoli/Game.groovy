package br.com.btoffoli

import br.com.btoffoli.canvasObjects.PointCanvas

import javax.swing.ImageIcon
import javax.swing.JFrame
import java.awt.BorderLayout
import java.awt.Canvas
import java.awt.Component
import java.awt.Graphics


import br.com.btoffoli.objects.PacmanObject
import br.com.btoffoli.canvasObjects.PacmanCanvas


/**
 * Created with IntelliJ IDEA.
 * User: btoffoli
 * Date: 5/18/14
 * Time: 11:32 PM
 * To change this template use File | Settings | File Templates.
 */
class Game {

    final JFrame mainWindow = new JFrame(title: 'Pacman')
//    final List<AbstractBaseMoveObject> moveObjects = []
  //  final List<PointObject> pointObjects = []

     PacmanObject pacman

    Game() {
        pacman = new PacmanObject(positionX: 30, positionY: 30)

        mainWindow.addKeyListener(pacman)
        mainWindow.layout = new BorderLayout()
        mainWindow.setSize(800, 800)
        mainWindow.title = 'Game'
        mainWindow.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        mainWindow.locationRelativeTo = null
        mainWindow.visible = true

        render()
    }

    private void render(){

        PacmanCanvas pacmanCanvas = mainWindow.add(new PacmanCanvas(), 0)

        PointCanvas pointCanvas = mainWindow.add(new PointCanvas(400, 400), 1)      

        


        Thread.startDaemon {
            while(true){

                //moveObjects.each { AbstractBaseMoveObject obj ->

                //}

                pacmanCanvas.setLocation(pacman.positionX, pacman.positionY)

                sleep(100)
            }

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
        new Game()

        //println(new File('./').absolutePath)

    }


}
