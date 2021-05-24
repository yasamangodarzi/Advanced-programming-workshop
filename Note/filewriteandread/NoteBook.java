package com.company;

import java.util.ArrayList;

public class NoteBook {
    ArrayList<Note>notes=new ArrayList<>();
    public void add(Note note)
    {
        notes.add(note);

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
