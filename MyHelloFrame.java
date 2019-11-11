import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * MyHelloFrame class
 *
 * @author (2018243144 노무라타카미치)
 * @version (20191111)
 */
public class MyHelloFrame extends JFrame
{
    public JLabel ml;
    public MyHelloFrame()
    {
        super("실습3(2018243144 노무라타카미치,2018771052 테오 켄신)");
        this.setSize(400,400);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ml = new JLabel("HELLO");
        MyHelloPanelListener hello = new MyHelloPanelListener(ml);
        this.add(hello);
        this.addMouseListener(hello);
        this.addKeyListener(hello);
    }
}
