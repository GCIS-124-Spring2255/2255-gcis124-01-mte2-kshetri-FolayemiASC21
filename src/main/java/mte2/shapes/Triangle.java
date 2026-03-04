// Question: Q1 (mte2, gcis124, 2255)
// Package name: shapes
// File name: Triangle.java

package mte2.shapes;

// public class Triangle {
public class Triangle implements Shape {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA,double sideB,double sideC) { this.sideA = sideA; this.sideB = sideB; this.sideC = sideC; }

    @Override
    public double perimeter() {
        return sideA + sideB + sideC;
    }
    @Override
    public double area() {
        double s = perimeter()  / 2; 
        return Math.sqrt(s*(s-sideA)*(s-sideB)*(s-sideC));
    }

    public static void main(String[] args) {
        
        Triangle t = new Triangle(5, 5, 5);
        System.out.println(t.area());
        System.out.println(t.perimeter());

    }
}