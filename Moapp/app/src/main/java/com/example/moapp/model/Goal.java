package com.example.moapp.model;

public class Goal {
    private String title;
    private String description;
    private String rate;

    public Goal() {


    }

    public Goal(String title,  String description) {
        this.title = title;
        this.description = description;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRate() { return rate; }

    public void setRate(String rate) { this.rate = rate; }

}
