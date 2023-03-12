package com.aptech.movietickets.dao;

import com.aptech.movietickets.mapper.Rowmapper;
import java.util.List;

public interface GenericDAO<T> {

    List<T> query(String sql, Rowmapper<T> rowMapper, Object... parameters);

    void update(String sql, Object... parameters);

    int insert(String sql, Object... parameters);

    int count(String sql, Object... parameters);
}
