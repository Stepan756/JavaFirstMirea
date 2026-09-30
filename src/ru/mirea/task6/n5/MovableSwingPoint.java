package ru.mirea.task6.n5;

import java.awt.*;

public class MovableSwingPoint implements MovableShape {
    private int x, y;
    private int xSpeed, ySpeed;
    private Color color;

    public MovableSwingPoint(int x, int y, int xSpeed, int ySpeed, Color color) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
        this.color = color;
    }

    @Override public void moveUp()    { y -= ySpeed; }
    @Override public void moveDown()  { y += ySpeed; }
    @Override public void moveLeft()  { x -= xSpeed; }
    @Override public void moveRight() { x += xSpeed; }

    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x, y, 20, 20);
    }
}