package CreateWindow;

import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;


public class States extends JFrame implements ItemListener {
    JPanel pnl = new JPanel();
    String[] styles = {"In the deep form", "For foodies", "Thin"};
    JComboBox<String> box = new JComboBox<String>(styles);
    JRadioButton rad1 = new JRadioButton("White");
    JRadioButton rad2 = new JRadioButton("Red");
    ButtonGroup wines = new ButtonGroup();
    JCheckBox chk = new JCheckBox("Peperoni");
    JTextArea txtarea = new JTextArea(5,38);
    public States(){
        super("Window Swing");
        setSize(500, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        wines.add(rad1);
        wines.add(rad2);
        pnl.add(rad1);
        pnl.add(rad2);
        pnl.add(chk);
        pnl.add(box);
        pnl.add(txtarea);
        rad1.addItemListener(this);
        rad2.addItemListener(this);
        chk.addItemListener(this);
        box.addItemListener(this);
        add(pnl);
        setVisible(true);

    }
    public void itemStateChanged(ItemEvent event){
        if (event.getItemSelectable() == rad1){
            txtarea.setText("Selected white wine");
        }
        if (event.getItemSelectable() == rad2){
            txtarea.setText("Selected Red wine");
        }
        if ((event.getItemSelectable() == chk) && (event.getStateChange() == ItemEvent.SELECTED)){
            txtarea.append("\nSelected Peperoni");
        }
        if ((event.getItemSelectable() == box) && (event.getStateChange() == ItemEvent.SELECTED)){
            txtarea.append("\nSelected " + event.getItem().toString());
        }
    }

    public static void main(String[] args) {
        States gui = new States();
    }
}
