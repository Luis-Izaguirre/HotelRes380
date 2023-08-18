package com.HotelResS.TheCodeFellaz.HotelModel;


import java.io.Serializable;

public class Room implements Serializable {
    private int roomNum;
    private String roomType;
    private int roomPrice;
    private int roomCapacity;
    private boolean availability;

    public Room() {
    }
    public Room(int roomNum, String roomType, int roomPrice, int roomCapacity, boolean availability){
        this.roomNum = roomNum;
        this.roomType = roomType;
        this.roomPrice = roomPrice;
        this.roomCapacity = roomCapacity;
        this.availability = availability;
    }

    public int getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(int roomNum) {
        this.roomNum = roomNum;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
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

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
}



  /*
    public enum RoomType {
        SINGLE, DOUBLE, SUITE
    }
    private static int totalRooms = 15;
    private static int availableRooms = totalRooms;

    private static final int MAX_PER_TYPE = 5;

    private static int freeRoomsSingle = MAX_PER_TYPE;
    private static int freeRoomsDouble = MAX_PER_TYPE;
    private static int freeRoomsSuite = MAX_PER_TYPE;
    private RoomType roomType;
    private int roomPrice;
    private int roomCapacity;
    private static boolean noMoreRooms = false;
    private static boolean noMoreRoomsSingle = false;
    private static boolean noMoreRoomsDouble = false;
    private static boolean noMoreRoomsSuite = false;



    public Room(RoomType roomType, int roomPrice, int roomCapacity) {

        this.roomType = roomType;
        this.roomPrice = roomPrice;
        this.roomCapacity = roomCapacity;
        //Decrements available rooms and roomType
        availableRooms--;
        freeRoomsSingle--;
        freeRoomsDouble--;
        freeRoomsSuite--;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
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
    //Condition check to see if there are available rooms.
    public static boolean getAvailableRooms(){
        if(availableRooms <= 0){
            noMoreRooms = true;
        }
        return noMoreRooms;
    }

     */