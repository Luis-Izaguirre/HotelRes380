package com.HotelResS.TheCodeFellaz.HotelModel;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.lang.annotation.Repeatable;

public class Room {
    private int roomType;
    private int roomPrice;
    private int roomCapacity;

    public Room(int roomType, int roomPrice, int roomCapacity) {
        this.roomType = roomType;
        this.roomPrice = roomPrice;
        this.roomCapacity = roomCapacity;
    }

    public int getRoomType() {
        return roomType;
    }

    public void setRoomType(int roomType) {
        this.roomType = roomType;
    }

    public int getRoomPrice() {
        return roomPrice;
    }

    public void setRoomPrice(int roomPrice) {
        this.roomPrice = roomPrice;
    }

    public int getRoomCapacity() {
        return roomCapacity;
    }

    public void setRoomCapacity(int roomCapacity) {
        this.roomCapacity = roomCapacity;
    }
}
