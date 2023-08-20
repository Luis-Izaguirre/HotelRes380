package com.HotelResS.TheCodeFellaz.HotelModel;

import org.apache.catalina.Manager;

public class Hotel {

    //private static instance
    private static Hotel hotel_instance = null;
    private String Name;
    private String Contact;
    private int Guest;
    private int RoomNum;
    private int RoomType;
    private  String CheckInDate;
    private  String CheckOutDate;
    private  Double Fees;
    private  Double Discount;
    private  String CheckInOutStatus;

    private static String CheckInTime;
    private static String CheckOutTime;

    private Hotel(){}
    public static Hotel getInstance(){
        if(hotel_instance == null) {
            hotel_instance = new Hotel();
        }
        return hotel_instance;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getContact() {
        return Contact;
    }

    public void setContact(String contact) {
        Contact = contact;
    }

    public int getGuest() {
        return Guest;
    }

    public void setGuest(int guest) {
        Guest = guest;
    }

    public int getRoomNum() {
        return RoomNum;
    }

    public void setRoomNum(int roomNum) {
        RoomNum = roomNum;
    }

    public int getRoomType() {
        return RoomType;
    }

    public void setRoomType(int roomType) {
        RoomType = roomType;
    }

    public String getCheckInDate() {
        return CheckInDate;
    }

    public void setCheckInDate(String checkInDate) {
        CheckInDate = checkInDate;
    }

    public String getCheckOutDate() {
        return CheckOutDate;
    }

    public void setCheckOutDate(String checkOutDate) {
        CheckOutDate = checkOutDate;
    }

    public Double getFees() {
        return Fees;
    }

    public void setFees(Double fees) {
        Fees = fees;
    }

    public Double getDiscount() {
        return Discount;
    }

    public void setDiscount(Double discount) {
        Discount = discount;
    }

    public String getCheckInOutStatus() {
        return CheckInOutStatus;
    }

    public void setCheckInOutStatus(String checkInOutStatus) {
        CheckInOutStatus = checkInOutStatus;
    }

    public static String getCheckInTime() {
        return CheckInTime;
    }

    public static void setCheckInTime(String checkInTime) {
        CheckInTime = checkInTime;
    }

    public static String getCheckOutTime() {
        return CheckOutTime;
    }

    public static void setCheckOutTime(String checkOutTime) {
        CheckOutTime = checkOutTime;
    }
}