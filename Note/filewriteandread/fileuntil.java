package com.company;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileOutputStream;
public class fileuntil {
    public void save(String adrees,String note)
    {
        try{
            FileOutputStream fout=new FileOutputStream(adrees);
            fout.write(Integer.parseInt(note));
            fout.close();

        }catch(Exception e){System.out.println(e);}
    }

    public void load(String name)
    {
        try {
            FileInputStream in = new FileInputStream(name);
            int c;
            while ((c = in.read()) != -1) {
                System.out.print(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
