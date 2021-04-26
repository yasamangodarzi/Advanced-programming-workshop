package com.company;

import java.util.Objects;

public class Triangle extends Polygon{
    public Triangle(Integer...args ) {
       super(args);
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
        if (!(o instanceof Triangle)) return false;
        Triangle triangle = (Triangle) o;
        return Objects.equals(sides, triangle.sides);
    }
    @Override
    public int hashCode() {
        return Objects.hash(sides);
    }

    @Override
    /**
     * This method returns shape information as a string
     * @return  Figure information
     */
    public String toString() {
       return  "Triangle::" + super.toString();

    }
    @Override
    /**
     * This method calculates the Perimeter
     * @return Shape area Perimeter
     */
    public double calculatePerimeter ()
    {
        return sides.get(0)+sides.get(1)+sides.get(2);
    }
    @Override
    /**
     * This method calculates the area
     * @return Shape area
     */
    public double calculateArea()
    {
        return Math.sqrt(calculatePerimeter()/2*(calculatePerimeter()/2-sides.get(0))*(calculatePerimeter()/2-
                sides.get(1))*(calculatePerimeter()/2-sides.get(2)));

    }
    public void draw()
    {
        System.out.println("Triangle");
        System.out.println("Perimeter : "+calculatePerimeter());
        System.out.println("Area : "+calculateArea());
    }
    public void isEquilateral()
    {
        if ((sides.get(0)==sides.get(1)))
        {
            if ((sides.get(0)==sides.get(2)))
            {
                System.out.println("The given triangle is an equilateral triangle");
            }
        }
    }
}
