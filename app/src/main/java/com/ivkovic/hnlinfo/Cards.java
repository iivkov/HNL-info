package com.ivkovic.hnlinfo;

public class Cards {
    private String Position;
    private String CardsClub;
    private String Yellow;
    private String SecondYellow;
    private String Red;
    private String Overall;

    public Cards() {
    }

    public Cards(String position, String cards_club, String yellow, String second_yellow, String red, String overall) {
        Position = position;
        CardsClub = cards_club;
        Yellow = yellow;
        SecondYellow = second_yellow;
        Red = red;
        Overall = overall;
    }

    public String getPosition() {
        return Position;
    }

    public String getCardsClub() {
        return CardsClub;
    }

    public String getYellow() {
        return Yellow;
    }

    public String getSecondYellow() {
        return SecondYellow;
    }

    public String getRed() {
        return Red;
    }

    public String getOverall() {
        return Overall;
    }
}
