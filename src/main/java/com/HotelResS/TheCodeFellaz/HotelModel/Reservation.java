package com.HotelResS.TheCodeFellaz.HotelModel;
import com.HotelResS.TheCodeFellaz.HotelModel.Customer;
import com.HotelResS.TheCodeFellaz.HotelModel.Room;

import java.util.*;

public class Reservation {

    private int guestNum;
    private String checkInDate;
    private String checkOutDate;
    private Customer customer;
    //NEED ROOMTYPE!!!!

    public Reservation() {
    }

    public Reservation(int guestNum, String checkInDate, String checkOutDate, Customer customer) {
        this.guestNum = guestNum;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.customer = customer;
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

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }


    //Utility Methods

    public void modifyReservation(int guestNum, String checkInDate, String checkOutDate, Customer customer, Room room){
        this.guestNum = guestNum;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.customer = customer;
    }



}