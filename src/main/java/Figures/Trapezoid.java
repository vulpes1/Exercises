package Figures;

public class Trapezoid implements Figure {

    private double lowerBase;
    private double upperBase;
    private double height;

    @Override
    public double calculateArea() {
        return 0.5 * height * (lowerBase + upperBase);
    }

    public Trapezoid(double lowerBase, double upperBase, double height) {
        this.lowerBase = lowerBase;
        this.upperBase = upperBase;
        this.height = height;
    }
}
