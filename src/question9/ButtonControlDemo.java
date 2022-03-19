package question9;

import javax.swing.*;

public class ButtonControlDemo extends JFrame {
    JButton b;

    ButtonControlDemo() {
        setSize(400, 300);
        setTitle("Button Control Demo");
        b = new JButton("Click Me");
        b.setBounds(150, 120,    100, 40);
        add(b);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ButtonControlDemo();
    }
}


