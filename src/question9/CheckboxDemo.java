package question9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.List;

public class CheckboxDemo extends JFrame implements ItemListener {
    JPanel p;
    JLabel lbltitle, lblval;
    JCheckBox chk1, chk2, chk3, chk4, chk5;
    JTextField tf;

    CheckboxDemo() {
        setSize(400, 300);
        setTitle("Checkbox Demo");
        p = new JPanel();
        lbltitle = new JLabel("Choose number from one to five : ");
        chk1 = new JCheckBox("1");
        chk2 = new JCheckBox("2");
        chk3 = new JCheckBox("3");
        chk4 = new JCheckBox("4");
        chk5 = new JCheckBox("5");
        lblval = new JLabel("Checked values:");
        tf = new JTextField(10);

        chk1.addItemListener(this);
        chk2.addItemListener(this);
        chk3.addItemListener(this);
        chk4.addItemListener(this);
        chk5.addItemListener(this);

        add(lbltitle);
        add(chk1);
        add(chk2);
        add(chk3);
        add(chk4);
        add(chk5);
        p.add(lblval);
        p.add(tf);
        add(p);

        setLayout(new FlowLayout(FlowLayout.LEFT, 100, 10));
        setVisible(true);
    }

    List<String> selected = new ArrayList<String>();
    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == chk1 && chk1.isSelected()) {
            selected.add(chk1.getText());
        }
        if (e.getSource() == chk2 && chk2.isSelected()) {
            selected.add(chk2.getText());
        }
        if (e.getSource() == chk3 && chk3.isSelected()) {
            selected.add(chk3.getText());
        }
        if (e.getSource() == chk4 && chk4.isSelected()) {
            selected.add(chk4.getText());
        }
        if (e.getSource() == chk5 && chk5.isSelected()) {
            selected.add(chk5.getText());
        }
        tf.setText(selected.toString());
    }

    public static void main(String[] args) {
        new CheckboxDemo();
    }
}



