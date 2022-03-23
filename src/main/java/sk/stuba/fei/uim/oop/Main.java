package sk.stuba.fei.uim.oop;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame okno = new JFrame();
        okno.setVisible(true);
        okno.setSize(300, 300);
        okno.setResizable(false);
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        okno.setLayout(new GridLayout(3,4));
        JLabel label = new JLabel("Hello world");
        okno.add(label);

        for (int i = 0; i < 10; i++) {
            okno.add(new JLabel("Hello " + i));
        }
    }
}
