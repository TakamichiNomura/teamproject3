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
    JLabel ml = new JLabel("Hello");
    JPanel mp = new JPanel();
    public MyHelloPanelListener(JPanel mp)
    {   
        this.mp.addMouseListener(new MyHelloPanelListener(mp));
        this.ml.addKeyListener(new MyHelloPanelListener(mp));
        
        this.mp.add(this.ml);
        
        this.ml.setFocusable(true);
        this.ml.requestFocus();
        
    }
    
    public void mouseClicked(MouseEvent e){
        mp = (JPanel)e.getSource();

        int x = e.getX();
        int y = e.getY();

        mp.setLocation(x,y);
    }
    
    public void mouseEntered(MouseEvent e){}
    public void mouseExited(MouseEvent e){}
    public void mousePressed(MouseEvent e){}
    public void mouseReleased(MouseEvent e){}
    
    
    public void keyPressed(KeyEvent e){
        ml = (JLabel)e.getSource();

        int x = ml.getX();
        int y = ml.getY();

        switch(e.getKeyCode()){
            case KeyEvent.VK_UP:
            ml.setLocation(x,y+10);
            case KeyEvent.VK_DOWN:
            ml.setLocation(x,y-10);
            case KeyEvent.VK_LEFT:
            ml.setLocation(x-10,y);
            case KeyEvent.VK_RIGHT:
            ml.setLocation(x+10,y);

        }

    }

    public void keyReleased(KeyEvent e){ }

    public void keyTyped(KeyEvent e){}
}
