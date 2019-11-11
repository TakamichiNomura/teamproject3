import javax.swing.*;
import java.awt.event.*;
/**
 * MyHelloFrame class
 *
 * @author (2018243144 노무라타카미치)
 * @version (20191111)
 */
public class MyHelloFrame extends JFrame
{
    public static JLabel ml;
    public static JPanel mp;
    public MyHelloFrame()
    {
        super("실습3(2018243144 노무라타카미치,2018771052 테오 켄신)");
        this.setSize(400,400);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        MyHelloListener myhello = new MyHelloListener();
        mp = new JPanel();
        ml = new JLabel("HELLO");
        ml.addMouseListener(myhello);
        ml.addKeyListener(myhello);
        mp.add(ml);
        this.add(ml);
    }
}
