package CreateWindow;

import javax.swing.*;
import java.awt.*;


public class Layout extends JFrame {
    JPanel pnl = new JPanel();
    Container contentPane = getContentPane();
    JPanel grid = new JPanel(new GridLayout(2, 2));

    public Layout() {
        super("Window Swing");
        setSize(500, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pnl.add(new JButton("Yes"));
        pnl.add(new JButton("No"));
        pnl.add(new JButton("Cancel"));
        grid.add(new JButton("1"));
        grid.add(new JButton("2"));
        grid.add(new JButton("3"));
        grid.add(new JButton("4"));
        add(pnl);
        contentPane.add("North", pnl);
        contentPane.add("Center", grid);
        contentPane.add("West", new JButton("West"));
        setVisible(true);

    }

    public static void main(String[] args) {
        new Layout();
    }
}
