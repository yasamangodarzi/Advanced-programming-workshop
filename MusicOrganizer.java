package com.company;
import java.util.ArrayList;

public class MusicOrganizer {
    ArrayList<Music> favoriteMusic = new ArrayList<>();

    public void chooseFavoriteMusic(Music music)
    {
        favoriteMusic.add(music);
    }
    public void removeFavoriteMusic(Music music)
    {
        favoriteMusic.remove(music);
    }
    public void printFavoriteMusic()
    {

        for (Music music:favoriteMusic) {
            System.out.println(music.toString());
        }
    }
    public void searchMusic(String address,String name)
    {
        boolean exist=false;
        for (Music str: favoriteMusic) {
            if (str.getAddress().equals(address))
            {
                if (str.getSingerName().equals(name))
                {
                    System.out.println("your music exist and correct");
                    exist=true;

                }
            }

        }
        if (!exist)
        {
            System.out.println("your music not exist and Incorrect");
        }
    }
}