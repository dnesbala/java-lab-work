package question9;

import java.awt.*;

public class PanelControlDemo {
    Frame f;
    Panel panel;
    Label text;

    PanelControlDemo() {
        f = new Frame();
        f.setSize(400, 300);
        f.setTitle("Panel Demo");
        panel = new Panel();
        panel.setBackground(Color.GREEN);
        panel.add(new Label("This text is added on the panel"));
        f.add(panel);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new PanelControlDemo();
    }
}

