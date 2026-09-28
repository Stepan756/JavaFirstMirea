package ru.mirea.task2.n2;

public class Ball {
    private double x = 0.0;
    private double y = 0.0;

    public Ball(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Ball(){
    }

    public double getX() {
        return x;
    }

    public double setX(double x) {
        return x;
    }

    public double getY() {
        return y;
    }

    public double setY(double y) {
        return x;
    }

    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void move(double xDisp, double yDisp) {
        this.x += xDisp;
        this.y += yDisp;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "x=" + x +
                ", y=" + y +
                '}';

    }
}