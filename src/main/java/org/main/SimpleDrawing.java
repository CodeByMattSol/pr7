package org.main;

import javax.swing.*;
import java.awt.*;



public class SimpleDrawing extends JPanel {

    public SimpleDrawing() {
        setPreferredSize(new Dimension(300, 300)); // установка размера панели

    }

    private void drawSmiley(Graphics g) {
        g.setColor(Color.orange);
        g.fillOval(50, 50, 200, 200);

        g.setColor(Color.white);
        g.fillOval(90, 100, 30, 30);
        g.fillOval(180, 100, 30, 30);
        g.setColor(Color.red);
        g.drawArc(100, 140, 100, 60, 180, 180);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawSmiley(g);
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("Simple Drawing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        SimpleDrawing drawing = new SimpleDrawing();
        frame.add(drawing);

        frame.pack();
        frame.setVisible(true);
    }
}