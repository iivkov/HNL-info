package com.ivkovic.hnlinfo;

public class Standings {
    private String Position;
    private String StandingsClub;
    private String Matches;
    private String Wins;
    private String Draws;
    private String Losses;
    private String Goals;
    private String Points;

    public Standings() {
    }

    public Standings(String position, String standings_club, String matches, String wins, String draws, String losses, String goals, String points) {
        Position = position;
        StandingsClub = standings_club;
        Matches = matches;
        Wins = wins;
        Draws = draws;
        Losses = losses;
        Goals = goals;
        Points = points;
    }

    public String getPosition() {
        return Position;
    }

    public String getStandingsClub() {
        return StandingsClub;
    }

    public String getMatches() {
        return Matches;
    }

    public String getWins() {
        return Wins;
    }

    public String getDraws() {
        return Draws;
    }

    public String getLosses() {
        return Losses;
    }

    public String getGoals() {
        return Goals;
    }

    public String getPoints() {
        return Points;
    }

}
