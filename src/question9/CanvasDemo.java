package question9;

import java.awt.*;

public class CanvasDemo extends Frame {
    CanvasDemo() {
        super("Canvas Demo");
        setSize(400, 300);

        Canvas c = new Canvas() {
            @Override
            public void paint(Graphics g) {
                g.setColor(Color.GREEN);
                g.drawRect(50, 50, 200, 100);
            }
        };

        c.setBackground(Color.BLACK);
        add(c);
        setVisible(true);
    }

    public static void main(String[] args) {
        new CanvasDemo();
    }
}




