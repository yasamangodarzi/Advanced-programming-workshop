package com.company;

import java.util.ArrayList;

public class Paint {
    ArrayList<Shape>shapes=new ArrayList<>();
    public void addShape(Shape shape)
    {
        shapes.add(shape);
    }
    public void drawAll()
    {
        for (Shape s:shapes) {
            s.draw();

        }
    }
    public void printAll()
    {
        for (Shape s:shapes) {
            System.out.append(s.toString()+"\n");

        }
    }
    public void describeEqualsides()
    {
        for (Shape s:shapes) {
            if (s instanceof Triangle)
            {  Triangle triangle=(Triangle) s;
                ((Triangle) s).isEquilateral();
            }
            if (s instanceof Rectangle)
            {
                ((Rectangle) s).isSquare();

            }
        }
    }
}
