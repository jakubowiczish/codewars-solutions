package _7kyu._7kyu_java_functional_programming_multiline_functions;

public class Triangle {

    public final int height;
    public final int base;
    private double area;

    public Triangle(int height, int base) {
        this.height = height;
        this.base = base;
    }

    public void setArea(double a) {
        area = a;
    }

    public double getArea() {
        return area;
    }
}

