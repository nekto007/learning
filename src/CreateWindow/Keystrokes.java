package CreateWindow;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class Keystrokes extends JFrame implements KeyListener {
    JPanel pnl = new JPanel();
    JTextField field = new JTextField(38);
    JTextArea txtArea = new JTextArea(5,38);
    public Keystrokes(){
        super("Window Swing");
        setSize(500, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pnl.add(field);
        pnl.add(txtArea);
        field.addKeyListener(this);
        add(pnl);
        setVisible(true);
    }
    public void keyPressed(KeyEvent event){
        txtArea.setText("Pushed key");
    }
    public void keyTyped(KeyEvent event){
        txtArea.setText("\nSymbol : " + event.getKeyChar() );
    }
    public void keyReleased(KeyEvent event) {
        int keyCode = event.getKeyCode();
        txtArea.append("\n Code key : " + event.getKeyCode());
        txtArea.append( "\nText key : " + event.getKeyText(keyCode));
    }

    public static void main(String[] args) {
        Keystrokes gui = new Keystrokes();
    }
}
