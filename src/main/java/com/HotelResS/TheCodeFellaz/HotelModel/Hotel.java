package com.HotelResS.TheCodeFellaz.HotelModel;

import org.apache.catalina.Manager;

public class Hotel {

    private static String Name;
    private static String Contact;
    private static int Guest;
    private static int RoomNum;
    private static int RoomType;
    private static String CheckInDate;
    private static String CheckOutDate;
    private static Double Fees;
    private static Double Discount;
    private static String CheckInOutStatus;


    //Mananger, Employee LATER
    private Employee employee;
    private Manager manager;
    private Payment payment;
    private Customer customer;

    public Hotel() {
    }


    public static String getName() {
        return Name;
    }

    public static void setName(String name) {
        Name = name;
    }

    public static String getContact() {
        return Contact;
    }

    public static void setContact(String contact) {
        Contact = contact;
    }

    public static int getGuest() {
        return Guest;
    }

    public static void setGuest(int guest) {
        Guest = guest;
    }

    public static int getRoomNum() {
        return RoomNum;
    }

    public static void setRoomNum(int roomNum) {
        RoomNum = roomNum;
    }

    public static int getRoomType() {
        return RoomType;
    }

    public static void setRoomType(int roomType) {
        RoomType = roomType;
    }

    public static String getCheckInDate() {
        return CheckInDate;
    }

    public static void setCheckInDate(String checkInDate) {
        CheckInDate = checkInDate;
    }

    public static String getCheckOutDate() {
        return CheckOutDate;
    }

    public static void setCheckOutDate(String checkOutDate) {
        CheckOutDate = checkOutDate;
    }

    public static Double getFees() {
        return Fees;
    }

    public static void setFees(Double fees) {
        Fees = fees;
    }

    public static Double getDiscount() {
        return Discount;
    }

    public static void setDiscount(Double discount) {
        Discount = discount;
    }

    public static String getCheckInOutStatus() {
        return CheckInOutStatus;
    }

    public static void setCheckInOutStatus(String checkInOutStatus) {
        CheckInOutStatus = checkInOutStatus;
    }
}