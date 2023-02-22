package com.aptech.movietickets.model;

import java.sql.Date;

public class MovieModel extends BaseModel<MovieModel> {

    private String title;
    private String cast;
    private String director;
    private String genres;
    private Date release;
    private int duration;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCast() {
        return cast;
    }

    public void setCast(String cast) {
        this.cast = cast;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGenres() {
        return genres;
    }

    public void setGenres(String genres) {
        this.genres = genres;
    }

    public Date getRelease() {
        return release;
    }

    public void setRelease(Date release) {
        this.release = release;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "MovieModel{" + "title=" + title + ", cast=" + cast + ", director=" + director + ", genres=" + genres + ", release=" + release + ", duration=" + duration + '}';
    }

}
