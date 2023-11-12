package org.group9.Shapes;

public class Square extends Rectangle {
    public Square(double x) {
        super(x, x);
    }

    @Override
    public double height() {
        return width();
    }

    @Override
    public double area() {
        return x * x;
    }

    @Override
    public double circumference() {
        return 4 * x;
    }
}
