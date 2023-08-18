package com.HotelResS.TheCodeFellaz.Service;

import com.HotelResS.TheCodeFellaz.HotelModel.Room;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class RoomService {


    public List<Room> addRoom(){
        List<Room> rooms = new ArrayList<>();

        rooms.add(new Room(1,"SINGLE", 60, 1, true));
        rooms.add(new Room(1,"SINGLE", 60, 1, true));
        rooms.add(new Room(1,"SINGLE", 60, 1, true));
        rooms.add(new Room(1,"SINGLE", 60, 1, false));


        return rooms;
    }
}
