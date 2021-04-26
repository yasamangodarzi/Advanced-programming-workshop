package com.company;

import java.util.ArrayList;

public class Paint {
    ArrayList<Circle>circles=new ArrayList<>();
    ArrayList<Triangle>triangles=new ArrayList<>();
    ArrayList<Rectangle>rectangles=new ArrayList<>();
    public void addCircle(Circle circle)
    {
        circles.add(circle);
    }
    public void addTriangle(Triangle triangle)
    {
       triangles.add(triangle);
    }
    public void addRectangle(Rectangle rectangle)
    {
        rectangles.add(rectangle);
    }
    public void printAll()
    {
        for (Circle c :circles) {
            System.out.println(c.toString());
        }
        for (Rectangle r :rectangles) {
            System.out.println(r.toString());
        }
        for (Triangle t :triangles) {
            System.out.println(t.toString());
        }
    }
    public void drawAll()
    {
        for (Circle c :circles) {
          c.draw();
        }
        for (Rectangle r :rectangles) {
           r.draw();
        }
        for (Triangle t :triangles) {
           t.draw();
        }
    }
}
