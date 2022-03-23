package sk.stuba.fei.uim.oop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPanel extends JPanel implements ActionListener {

    public MyPanel() {
        JButton button = new JButton("Klikni");
        JButton button2 = new JButton("Klikni");
        JButton button3 = new JButton("Klikni");
        button.addActionListener(this);
        this.add(button);
        this.add(button2);
        this.add(button3);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Haloooo");
    }
}
