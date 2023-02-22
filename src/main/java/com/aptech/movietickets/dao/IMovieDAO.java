package com.aptech.movietickets.dao;

import com.aptech.movietickets.model.MovieModel;
import java.util.List;

public interface IMovieDAO {

    List<MovieModel> findAll();

    MovieModel findOne(int id);

    int save(MovieModel movieModel);

    void update(MovieModel updateMovie);

    void delete(int id);

    MovieModel findByTitle(String title);

}
