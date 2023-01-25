package com.Accio.MovieManagementSystem;

public class Movie {
    private String name;
    private String director;
    private int rating;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Movie(String name, String director, int rating) {
        this.name = name;
        this.director = director;
        this.rating = rating;
    }
}
