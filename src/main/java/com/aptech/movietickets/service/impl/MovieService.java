package com.aptech.movietickets.service.impl;

import com.aptech.movietickets.dao.IMovieDAO;
import com.aptech.movietickets.dao.IScheduleDAO;
import com.aptech.movietickets.dao.impl.MovieDAO;
import com.aptech.movietickets.dao.impl.ScheduleDAO;
import com.aptech.movietickets.model.MovieModel;
import com.aptech.movietickets.service.IMovieService;
import java.util.List;

public class MovieService implements IMovieService {

    private IMovieDAO movieDAO = new MovieDAO();
    private IScheduleDAO scheduleDAO = new ScheduleDAO();

    @Override
    public MovieModel save(MovieModel movie) {
        int movie_id = movieDAO.save(movie);
        return movieDAO.findOne(movie_id);
    }

    @Override
    public MovieModel update(MovieModel updateMovie) {
        movieDAO.update(updateMovie);
        return movieDAO.findOne(updateMovie.getId());
    }

    @Override
    public List<MovieModel> findAll() {
        return movieDAO.findAll();
    }

    @Override
    public boolean delete(int id) {
        if (scheduleDAO.findByMovie_id(id) == null) {
            movieDAO.delete(id);
            return true;
        }
        return false;
    }
}
