package CreateWindow;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Actions extends JFrame implements ActionListener {
    JPanel pnl = new JPanel();
    JButton btn1 = new JButton("Button 1");
    JButton btn2 = new JButton("Button 2");
    JTextArea txtarea = new JTextArea(5, 38);

    public Actions() {
        super("Window Swing");
        pnl.add(btn1);
        pnl.add(btn2);
        pnl.add(txtarea);
        btn2.setEnabled(false);
        txtarea.setText("Button 2 disabled");
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        setSize(500, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(pnl);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent event) {
        txtarea.setText(event.getActionCommand() + " Pushed and disabled");
        if (event.getSource() == btn1) {
            btn2.setEnabled(true);
            btn1.setEnabled(false);
        }
        if (event.getSource() == btn2) {
            btn1.setEnabled(true);
            btn2.setEnabled(false);
        }

    }

    public static void main(String[] args) {
        Actions gui = new Actions();
    }
}
