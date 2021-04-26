package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
      Paint paint=new Paint();
        Shape circle1 =new Circle(19);
        Shape circle2 =new Circle(3);
        Shape triangle1=new Triangle(2,2,2);
        Shape triangle2=new Triangle(4,4,6);
        Shape rectangle1=new Rectangle(1,4,1,4);
        Shape rectangle2=new Rectangle(8,5,8,5);
        Shape rectangle3=new Rectangle(6,6,6,6);
        paint.addShape(circle1);
        paint.addShape(circle2);
        paint.addShape(rectangle1);
         paint.addShape(rectangle2);
         paint.addShape(rectangle3);
        paint.addShape(triangle1);
       paint.addShape(triangle2);
        paint.printAll();
        paint.drawAll();
        paint.describeEqualsides();



    }
}
