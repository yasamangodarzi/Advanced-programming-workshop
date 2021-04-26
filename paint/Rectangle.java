package com.company;

import java.util.ArrayList;
import java.util.Objects;

public class Rectangle {
    ArrayList<Integer> sides=new ArrayList();

    public Rectangle(int a,int b,int d,int c) {
        sides.add(a);
        sides.add(b);
        sides.add(d);
        sides.add(c);
    }
    public ArrayList<Integer> getSides() {
        return sides;
    }

    @Override
    public String toString() {
        String rectangle="rectangle::";
        for (int i=0;i<sides.size();i++)
        {
            rectangle=rectangle.concat("side").concat(""+(i+1)).concat(":").concat(""+sides.get(i)).concat(",");
        }
        return rectangle+"\n";
    }

    @Override
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
    public double calculatePerimeter ()
    {
        return sides.get(0)+sides.get(1)+sides.get(2)+sides.get(3);
    }
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
