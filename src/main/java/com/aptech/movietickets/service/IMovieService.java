package com.aptech.movietickets.service;

import com.aptech.movietickets.model.MovieModel;
import java.util.List;

public interface IMovieService {

    MovieModel save(MovieModel movie);

    MovieModel update(MovieModel updateMovie);

    List<MovieModel> findAll();

    boolean delete(int id);
}
