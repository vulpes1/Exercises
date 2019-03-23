package Figures;

public class Rectangle implements Figure {

    private double base;
    private double side;

    public Rectangle(double base, double side) {
        this.base = base;
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return (double) Math.round(base * side * 1000) / 1000;
    }
}

