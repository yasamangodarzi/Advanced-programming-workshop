package com.company;

import java.util.ArrayList;
import java.util.Objects;

public class Triangle {
    ArrayList<Integer>sides=new ArrayList();

    public Triangle(int a,int b,int d) {
       sides.add(a);
       sides.add(b);
       sides.add(d);
    }

    public ArrayList<Integer> getSides() {
        return sides;
    }

    @Override
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
    public String toString() {
         String triangle="triangle::";
         for (int i=0;i<sides.size();i++)
         {
             triangle=triangle.concat("side").concat(""+(i+1)).concat(":").concat(""+sides.get(i)).concat(",");
         }
         return triangle+"\n";
    }
    public double calculatePerimeter ()
    {
        return sides.get(0)+sides.get(1)+sides.get(2);
    }
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
