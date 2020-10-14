package CreateWindow;

import javax.swing.*;


public class Labels extends JFrame {
    JPanel pnl = new JPanel();
    ClassLoader ldr = this.getClass().getClassLoader();
    java.net.URL dukeURL = ldr.getResource("duke.png");
    ImageIcon duke = new ImageIcon(dukeURL);
    JLabel lbl1 = new JLabel(duke);
    JLabel lbl2 = new JLabel("Duke - talisman technology of Java");
    JLabel lbl3 = new JLabel("Duke", duke, JLabel.CENTER);
    public Labels(){
        super("Window Swing");
        lbl1.setToolTipText("Duke - talisman Java");
        lbl3.setHorizontalTextPosition(JLabel.CENTER);
        lbl3.setVerticalTextPosition(JLabel.BOTTOM);
        pnl.add(lbl1);
        pnl.add(lbl2);
        pnl.add(lbl3);
        setSize(500, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(pnl);
        setVisible(true);

    }

    public static void main(String[] args) {
        Labels gui = new Labels();
    }
}
