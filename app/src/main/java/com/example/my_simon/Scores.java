package com.example.my_simon;


import androidx.annotation.NonNull;

public class Scores {
    private String place;
    private String name;
    private String score;

    public Scores(String place, String name, String score){
        this.setPlace(place);
        this.setName(name);
        this.setScore(score);
    }


    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    @NonNull
    @Override
    public String toString() {
        return "Scores{" +
                "place=" + place +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
