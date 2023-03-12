
package com.aptech.movietickets.dao;

import com.aptech.movietickets.model.RoomModel;
import java.util.List;

/**
 *
 * @author phung
 */
public interface IRoomDAO {
    List<RoomModel> findAll();
    
    int save(RoomModel roomModel);
    
    void update(RoomModel updateRoom);
    
    void detele(int id);
    
    RoomModel findOne(int id);
    
    RoomModel findByName(String room_name);
    
    int getTotalItem();
}
