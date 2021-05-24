package com.company;

import java.io.*;

public class fileUntil {
    public void save(String adrees,String note)
    {
        try{
            FileOutputStream fout=new FileOutputStream(adrees);
            ObjectOutputStream objectOutputStream=new ObjectOutputStream(fout);
          objectOutputStream.write(Integer.parseInt(note));
          fout.close();
          objectOutputStream.close();

        }catch(Exception e){System.out.println(e);}
    }
    public void load(String name)
    {
        try {
            FileInputStream in = new FileInputStream(name);
            ObjectInputStream objectInputStream=new ObjectInputStream(in);
            Note note=(Note) objectInputStream.readObject();
            System.out.println(note.getTitle()   +""+note.getText());
            in.close();
            objectInputStream.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
