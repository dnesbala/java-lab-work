package question9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MousePosition extends MouseAdapter {
    JFrame f;
    JLabel xPos, yPos, comma;

    MousePosition() {
        f = new JFrame("Mouse Position");
        f.setSize(400, 300);
        xPos = new JLabel();
        comma = new JLabel(",");
        yPos = new JLabel();

        f.add(xPos);
        f.add(comma);
        f.add(yPos);
        f.setLayout(new FlowLayout());
        f.addMouseListener(this);
        f.setVisible(true);
    }

    public void mouseEntered(MouseEvent me) {
        int x = me.getX();
        int y = me.getY();
        xPos.setText(String.valueOf(x));
        yPos.setText(String.valueOf(y));
    }

    public static void main(String[] args) {
        new MousePosition();
    }
}

