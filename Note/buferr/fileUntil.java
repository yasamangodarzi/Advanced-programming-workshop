package com.company;

import java.io.*;

public class fileUntil {
    public void save(String adress,String note)
    {
        try(  FileWriter fileWriter=new FileWriter(adress);
              BufferedWriter bufferedWriter=new BufferedWriter(fileWriter))
        {
            bufferedWriter.write(note);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public void load(String adrees) throws IOException {
        String result="";
        try  {
            FileReader fileReader=new FileReader(adrees);
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            String text="";
            while ((text=bufferedReader.readLine())!=null)
            {
                result=result.concat(text);
            }
            System.out.println(result);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public void edit(String adrees,String note) throws IOException {
        String result="";
        FileReader fileReader=new FileReader(adrees);
        BufferedReader bufferedReader=new BufferedReader(fileReader);
        String text="";
        while ((text=bufferedReader.readLine())!=null)
        {
            result=result.concat(text);
        }
        result=result.concat(note);
        try(  FileWriter fileWriter=new FileWriter(adrees);
              BufferedWriter bufferedWriter=new BufferedWriter(fileWriter))
        {
            bufferedWriter.write(result);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
