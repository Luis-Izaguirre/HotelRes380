package com.HotelResS.TheCodeFellaz.HotelFunc;

import com.HotelResS.TheCodeFellaz.HotelModel.Customer;
import com.HotelResS.TheCodeFellaz.HotelModel.Room;

public class ReservationDTO { //Data Transfer To Object, Used to intact with web page
    //Customer
    private String name;
    private String email;
    private String phone;

    //Reservation
    private int guestNum;
    private String checkInDate;
    private String checkOutDate;


    public ReservationDTO() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getGuestNum() {
        return guestNum;
    }

    public void setGuestNum(int guestNum) {
        this.guestNum = guestNum;
    }

    public String getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(String checkInDate) {
        this.checkInDate = checkInDate;
    }

    public String getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(String checkOutDate) {
        this.checkOutDate = checkOutDate;
    }


}
