package com.company;

import java.util.ArrayList;

public class Polygon extends Shape {
    ArrayList<Integer> sides=new ArrayList();

    public Polygon(Integer...args) {
        for (Integer arg:args) {
            sides.add(arg);
        }
    }
    public String toString()
    {

        String side= "";
        for (int i=0;i<sides.size();i++)
        {
            side=side.concat("side").concat(""+(i+1)).concat(":").concat(""+sides.get(i)).concat(",");
        }
        return side+"\n";
    }


    public ArrayList<Integer> getSides() {
        return sides;
    }

}
