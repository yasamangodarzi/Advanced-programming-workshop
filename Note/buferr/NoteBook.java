package com.company;
import java.util.*;
import java.util.ArrayList;
/**
 * this class create the notebook
 */
public class NoteBook {
    fileUntil fileUntil=new fileUntil();
    int i=1;
    ArrayList<Note>notes=new ArrayList<>();
    public void add(Note note)
    {
        notes.add(note);

        fileUntil.save("./text"+i+".text",note.getTitle()+"         "+note.getText());
        i++;

    }
    public void remove(Note note)
    {
        notes.remove(note);
    }
    public  void print()
    {
        int i=1;
        for (Note n:notes) {
            System.out.println(i+")"+n.getTitle());
            i++;
        }
    }
    public void choice(int i)
    {
        i++;
        System.out.println(notes.get(i).getTitle());
        System.out.println(notes.get(i).getText());
    }

}
