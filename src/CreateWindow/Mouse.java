package CreateWindow;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;


public class Mouse extends JFrame implements MouseListener, MouseMotionListener {
    JPanel pnl = new JPanel();
    JTextArea txtArea = new JTextArea(8,38);
    int x,y;
    public Mouse(){
        super("Window Swing");
        setSize(500, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pnl.add(txtArea);
        txtArea.addMouseListener(this);
        txtArea.addMouseMotionListener(this);
        add(pnl);
        setVisible(true);

    }
    public void mouseMoved(MouseEvent event){
        x = event.getX();
        y = event.getY();
    }
    public void mouseDragged(MouseEvent event){}
    public void mouseEntered(MouseEvent event) {
        txtArea.setText("\nPressed button mouse");
    }
    public void mousePressed(MouseEvent event){
        txtArea.append("\nPressed button, when pointer in positin X: " + x + " Y: " + y );
    }
    public void mouseReleased(MouseEvent event){
        txtArea.append("\nButton mouse released");
    }
    public void mouseClicked(MouseEvent event){}
    public void mouseExited(MouseEvent event){}
    public static void main(String[] args) {
        Mouse gui = new Mouse();
    }
}
