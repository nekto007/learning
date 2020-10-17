package CreateWindow;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Request extends JFrame  implements ActionListener {
    JPanel pnl = new JPanel();
    JTextField field = new JTextField(38);
    JButton btn1 = new JButton("Confirmation request");
    JButton btn2 = new JButton("The I/O request");
    public Request(){
        super("Window Swing");
        setSize(500, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pnl.add(field);
        pnl.add(btn1);
        pnl.add(btn2);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        add(pnl);
        setVisible(true);

    }

    public static void main(String[] args) {
        Request gui = new Request();
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == btn1){
            int n = JOptionPane.showConfirmDialog(this,"Do you agree?", "Confirm dialog", JOptionPane.YES_NO_CANCEL_OPTION);
            switch (n) {
                case 0 -> field.setText("I agree");
                case 1 -> field.setText("I don't agree");
                case 2 -> field.setText("Canceled");
            }
        }
        if (event.getSource() == btn2){
            field.setText(JOptionPane.showInputDialog(this, "Enter your comment", "Enter dialog", JOptionPane.PLAIN_MESSAGE));
        }
    }
}
