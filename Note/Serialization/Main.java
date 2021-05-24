package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws  IOException {
        Note note=new Note("friday","call your mather","13400/1/2");
        Note note1=new Note("sunday","go park and see your friend","13400/1/5");
        Note note2=new Note("monday","go shop","13400/1/8");
        NoteBook noteBook=new NoteBook();
        noteBook.add(note);
        noteBook.add(note1);
        noteBook.add(note2);
        noteBook.print();
        fileUntil fileUntil=new fileUntil();
        fileUntil.save("./text1.bin",note.getTitle()+"         "+note.getText());
        fileUntil.save("./text2.bin",note1.getTitle()+"         "+note1.getText());
        fileUntil.save("./text3.bin",note2.getTitle()+"         "+note2.getText());
        fileUntil.load("./text1.bin");
        fileUntil.load("./text2.bin");
        fileUntil.load("./text3.bin");

    }
}
