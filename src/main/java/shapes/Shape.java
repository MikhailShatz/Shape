package shapes;

import interfaces.IDraw;

public abstract class Shape implements IDraw {
    private int x;

    private int y;

    private String color;

    private boolean visible;

    public Shape(int x, int y, String color, boolean visible) {
        this.x = x;
        this.y = y;
        this.color = color;
        this.visible = visible;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    abstract double getArea();

    abstract double getPerimeter();


}
