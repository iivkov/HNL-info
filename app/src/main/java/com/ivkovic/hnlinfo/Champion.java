package com.ivkovic.hnlinfo;

public class Champion {

    private String Season;
    private String ChampionClub;

    public Champion() {
    }

    public Champion(String season, String club) {
        Season = season;
        ChampionClub = club;
    }

    public String getSeason() {
        return Season;
    }

    public String getChampionClub() {
        return ChampionClub;
    }

}
