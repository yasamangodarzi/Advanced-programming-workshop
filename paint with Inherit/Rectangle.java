package com.company;

import java.util.ArrayList;
import java.util.Objects;

public class Rectangle extends Polygon{


    public Rectangle(Integer...args) {
        super(args);
    }
    public ArrayList<Integer> getSides() {
        return sides;
    }

    @Override
    /**
     * This method returns shape information as a string
     * @return  Figure information
     */
    public String toString() {

        return "rectangle::" + super.toString();
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
        if (!(o instanceof Rectangle)) return false;
        Rectangle rectangle = (Rectangle) o;
        return Objects.equals(sides, rectangle.sides);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sides);
    }
    @Override
    /**
     * This method calculates the Perimeter
     * @return Shape area Perimeter
     */
    public double calculatePerimeter ()
    {
        return sides.get(0)+sides.get(1)+sides.get(2)+sides.get(3);
    }
    @Override
    /**
     * This method calculates the area
     * @return Shape area
     */
    public double calculateArea()
    {
        if (sides.get(0)==sides.get(1))
        {
            return sides.get(0) *sides.get(2) ;
        }else if (sides.get(0)==sides.get(2))
        {
            return  sides.get(0) *sides.get(1);
        }else if (sides.get(0)==sides.get(3))
        {
            return  sides.get(0) *sides.get(2);
        }
        return 0;
    }
    @Override
    public void draw()
    {
        System.out.println("Rectangle");
        System.out.println("Perimeter : "+calculatePerimeter());
        System.out.println("Area : "+calculateArea());
    }
    public void isSquare()
    {
        if (sides.get(0)==sides.get(1))
        {
            if (sides.get(0)==sides.get(2))
            {
                if (sides.get(0)==sides.get(3))
                {
                    System.out.println("The given Rectangle is an Square");
                }
            }
        }
    }
}
