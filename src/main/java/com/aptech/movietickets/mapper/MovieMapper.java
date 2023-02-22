package com.aptech.movietickets.mapper;

import com.aptech.movietickets.model.MovieModel;
import java.sql.ResultSet;

public class MovieMapper implements Rowmapper<MovieModel> {

    @Override
    public MovieModel mapRow(ResultSet rs) {
        try {
            MovieModel movie = new MovieModel();
            movie.setId(rs.getInt("id"));
            movie.setTitle(rs.getString("title"));
            movie.setCast(rs.getString("cast"));
            movie.setDirector(rs.getString("director"));
            movie.setGenres(rs.getString("genres"));
            movie.setDuration(rs.getInt("duration"));
            movie.setRelease(rs.getDate("release"));
            return movie;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
