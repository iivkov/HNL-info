package com.ivkovic.hnlinfo;

public class Goalscorers {
    private String NumberOfGoals;
    private String Players;

    public Goalscorers() {
    }

    public Goalscorers(String number_of_goals, String players) {
        NumberOfGoals = number_of_goals;
        Players = players;
    }

    public String getNumberOfGoals() {
        return NumberOfGoals;
    }

    public String getPlayers() {
        return Players;
    }

}
