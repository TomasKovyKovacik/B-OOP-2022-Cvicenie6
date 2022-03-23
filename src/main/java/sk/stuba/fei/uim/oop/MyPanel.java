package sk.stuba.fei.uim.oop;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        this.vlastnyPaint(g);
    }

    private void vlastnyPaint(Graphics g) {
        g.setColor(Color.GREEN);
        g.fillRect(100,100,100,100);
        g.setColor(Color.RED);
        g.fillPolygon(new int[] {100, 200, 150}, new int[] {100, 100, 50}, 3);


        g.setColor(Color.CYAN);
        for (int x = 0; x < 2; x++) {
            for (int y = 0; y < 2; y++) {
                g.fillRect(110 + 45 * x, 110 + 45 * y, 35, 35);
            }
        }
    }
}
