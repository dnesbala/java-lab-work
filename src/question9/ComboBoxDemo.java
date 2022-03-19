package question9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Objects;

public class ComboBoxDemo extends JFrame implements ItemListener {
    JLabel lblnumber, lblselected, lblselectedval;
    JComboBox cmbnumber;

    ComboBoxDemo() {
        setSize(400, 300);
        setTitle("Combo Box Demo");
        lblnumber = new JLabel("Choose number: ");
        String numbers[] = {"1", "2", "3", "4", "5"};
        cmbnumber = new JComboBox(numbers);
        lblselected = new JLabel("Selected number = ");
        lblselectedval = new JLabel(Objects.requireNonNull(cmbnumber.getSelectedItem()).toString());
        cmbnumber.addItemListener(this);
        add(lblnumber);
        add(cmbnumber);
        add(lblselected);
        add(lblselectedval);
        setLayout(new FlowLayout(FlowLayout.CENTER, 120, 50));
        setVisible(true);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        lblselectedval.setText(Objects.requireNonNull(cmbnumber.getSelectedItem()).toString());
    }

    public static void main(String[] args) {
        new ComboBoxDemo();
    }
}

