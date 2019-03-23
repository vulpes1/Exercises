package Figures;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Circle implements Figure {

    private double semidiameter;

    public Circle(double semidiameter) {
        this.semidiameter = semidiameter;
    }

    @Override
    public double calculateArea() {
        if (semidiameter < 0) {
            System.out.println("bad argument's value - radius must be positive");
            throw new IllegalArgumentException();
        }
        return PI * pow(semidiameter, 2);
    }
}
