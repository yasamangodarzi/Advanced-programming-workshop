package com.company;

/**
 * this class create the note
 */
public class Note {
    private String title;
    private String text;
    private String date;
    /**
     * Constructor for  note objects. This constructor
     * creates a new  note.
     */
    public Note(String title, String text, String date) {
        this.title = title;
        this.text = text;
        this.date = date;
    }
    /**
     *  This method getTitle
     * @return  Title
     */
    public String getTitle() {
        return title;
    }
    /**
     *  This method getText
     * @return  Text
     */
    public String getText() {
        return text;
    }
    /**
     *  This method getdate
     * @return  dete
     */
    public String getDate() {
        return date;
    }

}
