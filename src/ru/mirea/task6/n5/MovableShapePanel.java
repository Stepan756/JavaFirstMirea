package ru.mirea.task6.n5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MovableShapePanel extends JPanel {
    private MovableSwingPoint point;

    public MovableShapePanel() {
        setBackground(Color.WHITE);
        point = new MovableSwingPoint(200, 200, 10, 10, Color.RED);

        setFocusable(true);
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_UP:    point.moveUp(); break;
                    case KeyEvent.VK_DOWN:  point.moveDown(); break;
                    case KeyEvent.VK_LEFT:  point.moveLeft(); break;
                    case KeyEvent.VK_RIGHT: point.moveRight(); break;
                }
                repaint();
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        point.draw(g);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Movable в Swing");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(500, 500);
            frame.add(new MovableShapePanel());
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}