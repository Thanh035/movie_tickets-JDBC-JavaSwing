
package com.aptech.movietickets.mapper;

import java.sql.ResultSet;

public interface Rowmapper<T> {

    T mapRow(ResultSet rs);
}
