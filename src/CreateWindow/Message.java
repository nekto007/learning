package CreateWindow;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Message extends JFrame implements ActionListener {
    JPanel pnl = new JPanel();
    JButton btn1 = new JButton("Show information message");
    JButton btn2 = new JButton("Show exception");
    JButton btn3 = new JButton("Show meesage of error");
    public Message(){
        super("Window Swing");
        setSize(500, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pnl.add(btn1);
        pnl.add(btn2);
        pnl.add(btn3);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        add(pnl);
        setVisible(true);

    }

    public static void main(String[] args) {
        Message gui = new Message();
    }

    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == btn1) {
            JOptionPane.showMessageDialog(this, "Information...", "Dialog message", JOptionPane.INFORMATION_MESSAGE);
        }
        if (event.getSource() == btn2){
            JOptionPane.showMessageDialog(this, "Exception...", "Dialog message", JOptionPane.WARNING_MESSAGE);
        }
        if (event.getSource() == btn3){
            JOptionPane.showMessageDialog(this, "Error...", "Dialog message", JOptionPane.ERROR_MESSAGE);
        }
    }
}
