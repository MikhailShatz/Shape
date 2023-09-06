package shapes;

import interfaces.IDance;

public class Circle extends Shape implements IDance {
    private int radius;

    public Circle(int x, int y, String color, boolean visible, int radius) {
        super(x, y, color, visible);
        this.radius = radius;
    }

    @Override
   public  double getArea() {
        return Math.PI*radius*radius;
    }
    @Override
   public double getPerimeter() {
        return 2*Math.PI*radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius){
        this.radius = radius;
    }

    @Override
    public void drawing() {
        System.out.println("Drawing circle");
    }

    @Override
    public void drawingRed() {
        super.drawingRed();
    }

    @Override
    public void dancingTango() {
        System.out.println("Dancing tango circle");
    }
}
