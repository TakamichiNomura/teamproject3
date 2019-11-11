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
    public MyHelloFrame()
    {
        super("실습3(2018243144 노무라타카미치,2018771052 테오 켄신)");
        this.setSize(400,400);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.add(new MyHelloPanelListener(new JPanel()));
    }
}
