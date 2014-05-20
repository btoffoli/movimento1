package src.main.br.com.btoffoli.objects

import java.awt.event.KeyEvent
import java.awt.event.KeyListener

/**
 * Created with IntelliJ IDEA.
 * User: btoffoli
 * Date: 5/18/14
 * Time: 11:36 PM
 * To change this template use File | Settings | File Templates.
 */
class PacmanObject extends AbstractBaseMoveObject implements KeyListener {

    /**EVENTOS DE TECLADO**/
    @Override
    void keyTyped(KeyEvent e) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    void keyPressed(KeyEvent e) {
        if (e.keyCode == KeyEvent.VK_RIGHT){
            println 'DIREITA'
            positionX += stepSizePosition
        }


        if (e.keyCode == KeyEvent.VK_LEFT) {
            println 'ESQUERDA'
            positionX -= stepSizePosition
        }

        if (e.keyCode == KeyEvent.VK_DOWN) {
            println 'ABAIXO'
            positionY += stepSizePosition
        }

        if (e.keyCode == KeyEvent.VK_UP) {
            println 'ACIMA'
            positionY -= stepSizePosition
        }

    }

    @Override
    void keyReleased(KeyEvent e) {
        //To chan
    }

}
