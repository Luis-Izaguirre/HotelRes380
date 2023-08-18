package com.HotelResS.TheCodeFellaz.CSVBASE;
import com.HotelResS.TheCodeFellaz.HotelModel.Room;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class RoomDatabase {
    public static List<Room> allRooms = new ArrayList<>();

    public static List<Room> getAllRooms() {
        return allRooms;
    }

    public void setAllRooms(List<Room> allRooms) {
        this.allRooms = allRooms;
    }
}
