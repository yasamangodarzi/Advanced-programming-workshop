package com.company;

public class Music {
    private String address;
    private String singerName;
    private String yearpublication;


    public Music(String address, String singerName, String yearpublication) {
        this.address = address;
        this.singerName = singerName;
        this.yearpublication = yearpublication;

    }

    @Override
    public String toString() {
        return "Music{" +
                "address='" + address + '\'' +
                ", singerName='" + singerName + '\'' +
                ", yearpublication='" + yearpublication + '\'' +
                '}';
    }

    public String getAddress() {
        return address;
    }

    public String getSingerName() {
        return singerName;
    }
}
