package com.ivkovic.hnlinfo;

public class Club {
    private int Logo;
    private String Name;
    private String Location;
    private String Established;
    private String Stadium;
    private String StadiumCapacity;
    private String Chairman;
    private String Manager;
    private String Website;
    private int StadiumPhoto;

    public Club() {
    }

    public Club(int logo, String name, String location, String established, String stadium, String stadium_capacity, String chairman, String manager, String website, int stadium_photo) {
        Logo = logo;
        Name = name;
        Location = location;
        Established = established;
        Stadium = stadium;
        StadiumCapacity = stadium_capacity;
        Chairman = chairman;
        Manager = manager;
        Website = website;
        StadiumPhoto = stadium_photo;
    }

    public int getLogo() {
        return Logo;
    }

    public String getName() {
        return Name;
    }

    public String getLocation() {
        return Location;
    }

    public String getEstablished() {
        return Established;
    }

    public String getStadium() {
        return Stadium;
    }

    public String getStadiumCapacity() {
        return StadiumCapacity;
    }

    public String getChairman() {
        return Chairman;
    }

    public String getManager() {
        return Manager;
    }

    public String getWebsite() {
        return Website;
    }

    public int getStadiumPhoto() {
        return StadiumPhoto;
    }
}
