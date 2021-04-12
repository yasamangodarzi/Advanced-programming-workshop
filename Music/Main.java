package com.company;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
          MusicOrganizer musicOrganizer=new MusicOrganizer();
          MusicCollection pop=new MusicCollection();
          MusicCollection jazz=new MusicCollection();
          MusicCollection rcok=new MusicCollection();
          MusicCollection country=new MusicCollection();
          Music music=new Music("Dmusic1","mohsen","2000");
          Music music1=new Music("Dmusic2","ali","2001");
          Music music2=new Music("Dmusic3","amir","2010");
          //add music to pop
        pop.addFile("baran");
        pop.addFile("roz");
        pop.addFile("ziba");
        pop.addFile("to");
        //add music to rock
        rcok.addFile("star");
        rcok.addFile("sun");
        //add music to jazz
        jazz.addFile("you");
        // add music to country
        country.addFile("yal");
        //list file
        System.out.println("pop song");
        pop.listAllFiles();
        System.out.println("rock song");
        rcok.listAllFiles();
        System.out.println("jazz song");
        jazz.listAllFiles();
        System.out.println("country song");
        country.listAllFiles();
        //list index
        System.out.println("pop song from index 1");
        pop.listFile(1);
        //remove pop
        System.out.println("pop song with remove index 2");
        pop.removeFile(2);
        pop.listAllFiles();
        //stop and play
        System.out.println("jazz song play ");
        jazz.startPlaying(0);
        jazz.stopPlaying();
               //add music to favorite music
        System.out.println("your favorite music");
             musicOrganizer.chooseFavoriteMusic(music);
             musicOrganizer.chooseFavoriteMusic(music1);
             musicOrganizer.chooseFavoriteMusic(music2);
             //print music favorite
             musicOrganizer.printFavoriteMusic();
             // remove music to favorite music
        musicOrganizer.removeFavoriteMusic(music);
        //print music favorite
        System.out.println("your favorite music with remove music ");
        musicOrganizer.printFavoriteMusic();
        //search music favorite
        System.out.println(" correct search");
        musicOrganizer.searchMusic("Dmusic2","ali");
        System.out.println(" incorrect search");
        musicOrganizer.searchMusic("Dmusic1","mohsen");


    }

}
