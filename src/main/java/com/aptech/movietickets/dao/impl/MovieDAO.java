package com.aptech.movietickets.dao.impl;

import com.aptech.movietickets.dao.IMovieDAO;
import com.aptech.movietickets.mapper.MovieMapper;
import com.aptech.movietickets.model.MovieModel;
import java.util.List;

public class MovieDAO extends BaseDAO<MovieModel> implements IMovieDAO {

    @Override
    public List<MovieModel> findAll() {
        String sql = "SELECT * FROM movie";
        return query(sql, new MovieMapper());
    }

    @Override
    public MovieModel findOne(int id) {
        String sql = "SELECT * FROM movie WHERE id = ?";
        List<MovieModel> movies = query(sql, new MovieMapper(), id);
        return movies.isEmpty() ? null : movies.get(0);
    }

    @Override
    public int save(MovieModel movieModel) {
        StringBuilder sql = new StringBuilder("INSERT INTO `movie`(`genres`, `release`, `duration`, `cast`, `director`, `title`) ");
        sql.append("VALUES (?,?,?,?,?,?)");
        return insert(sql.toString(),
                movieModel.getGenres(),
                movieModel.getRelease(),
                movieModel.getDuration(),
                movieModel.getCast(),
                movieModel.getDirector(),
                movieModel.getTitle());
    }

    @Override
    public void update(MovieModel updateMovie) {
        String sql = "UPDATE `movie` SET `genres`= ?,`release`= ?,`duration`= ?,`cast`= ?,`director`= ?,`title`= ? WHERE id = ?";
        update(sql,
                updateMovie.getGenres(),
                updateMovie.getRelease(),
                updateMovie.getDuration(),
                updateMovie.getCast(),
                updateMovie.getDirector(),
                updateMovie.getTitle(),
                updateMovie.getId());
    }

    @Override
    public void delete(int id) {
        String sql = "DELETE FROM movie WHERE id = ?";
        update(sql, id);
    }

    @Override
    public MovieModel findByTitle(String title) {
        String sql = "SELECT * FROM movie WHERE title = ?";
        List<MovieModel> movies = query(sql, new MovieMapper(), title);
        return movies.isEmpty() ? null : movies.get(0);
    }

    @Override
    public int getTotalItem() {
        String sql = "SELECT count(*) FROM movie";
        return count(sql);
    }

}
