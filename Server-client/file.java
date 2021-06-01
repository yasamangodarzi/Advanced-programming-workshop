package com.company;

import java.io.*;

/**
 * this class save information in the file
 */
public class file{
    /**
     * save in file
     * @param str information
     */
    public void save(String str)
    {
        try{

            BufferedWriter writer = new BufferedWriter(new FileWriter("./1.txt"));
            writer.write(str);

            writer.close();

        }catch(Exception e){System.out.println(e);}
    }


}
