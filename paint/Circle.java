package com.company;
import java.lang.Math.*;
import java.util.Objects;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
    public double calculatePerimeter ()
    {
        return 2*Math.PI*radius;
    }
    public double calculateArea()
    {
        return  Math.PI*Math.pow(radius,2);
    }
    public void draw()
    {
        System.out.println("Circle");
        System.out.println("Perimeter : "+calculatePerimeter());
        System.out.println("Area : "+calculateArea());
    }
}
