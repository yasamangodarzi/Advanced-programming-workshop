package com.company;
import java.util.Objects;

/**
 * This class creates the shape of a circle
 * by inheriting from the shape class
 */
public class Circle extends Shape{
    //field
    //radius of circle
    private double radius;
     /**
     * This constructor
     * creates a new  circle.
     * @param radius
     */
    public Circle(double radius) {
        this.radius = radius;
    }
    /**
     *  This method getRadius
     * @return Radius
     */

    public double getRadius() {
        return radius;
    }

    @Override

    /**
     * This method compares the equality of
     * the two formed by it
     * @param o The object being checked for equality
     * @return Answer Check that the two objects are the same
     */
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
    /**
     * This method returns shape information as a string
     * @return  Figure information
     */
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    /**
     * This method calculates the Perimeter
     * @return Shape area Perimeter
     */
    @Override
    public double calculatePerimeter ()
    {
        return 2*Math.PI*radius;
    }
    @Override
    /**
     * This method calculates the area
     * @return Shape area
     */
    public double calculateArea()
    {
        return  Math.PI*Math.pow(radius,2);
    }
    @Override
    /**
     * This method prints the name,
     * Perimeter and area of the circle
     */
    public void draw()
    {
        System.out.println("Circle");
        System.out.println("Perimeter : "+calculatePerimeter());
        System.out.println("Area : "+calculateArea());
    }

}
