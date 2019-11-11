import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Write a description of class MyListener here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyHelloPanelListener extends JPanel implements KeyListener, MouseListener
{
    JLabel hellolabel;
    public MyHelloPanelListener(JLabel ml)
    {   
        hellolabel = ml;
        this.add(hellolabel);
        this.setFocusable(true);
        this.requestFocus();
    }
    
    public void mouseClicked(MouseEvent e){
        int x = e.getX();
        int y = e.getY();
        hellolabel.setLocation(x,y);
    }
    
    public void mouseEntered(MouseEvent e){}
    public void mouseExited(MouseEvent e){}
    public void mousePressed(MouseEvent e){}
    public void mouseReleased(MouseEvent e){}
    
    
    public void keyPressed(KeyEvent e){
        hellolabel = (JLabel)e.getSource();

        int x = hellolabel.getX();
        int y = hellolabel.getY();

        switch(e.getKeyCode()){
            case KeyEvent.VK_UP:
            hellolabel.setLocation(x,y+10);
            break;
            case KeyEvent.VK_DOWN:
            hellolabel.setLocation(x,y-10);
            break;
            case KeyEvent.VK_LEFT:
            hellolabel.setLocation(x-10,y);
            break;
            case KeyEvent.VK_RIGHT:
            hellolabel.setLocation(x+10,y);
            break;
        }

    }

    public void keyReleased(KeyEvent e){ }

    public void keyTyped(KeyEvent e){}
}
