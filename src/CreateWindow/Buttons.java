package CreateWindow;

import javax.swing.*;


public class Buttons extends JFrame {

    ClassLoader ldr = this.getClass().getClassLoader();
    java.net.URL tickURL = ldr.getResource("tick.png");
    java.net.URL crossURL = ldr.getResource("cross.png");
    ImageIcon tick = new ImageIcon(tickURL);
    ImageIcon cross = new ImageIcon(crossURL);
    JPanel pnl = new JPanel();
    JButton btn = new JButton("Push me");
    JButton tickBtn = new JButton(tick);
    JButton crossBtn = new JButton("STOP", cross);

    public Buttons() {

        super("Window Swing");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pnl.add(btn);
        pnl.add(tickBtn);
        pnl.add(crossBtn);
        add(pnl);
        setVisible(true);
    }

    public static void main(String[] args) {
        Buttons gui = new Buttons();
    }
}
