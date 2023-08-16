package com.HotelResS.TheCodeFellaz.HotelModel;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.lang.annotation.Repeatable;

public class Room {
    private String checkinDate;
    private String checkoutDate;
    private String numGuests;

    public Room(String checkinDate, String checkoutDate, String numGuests) {
        this.checkinDate = checkinDate;
        this.checkoutDate = checkoutDate;
        this.numGuests = numGuests;
    }


    public String getCheckinDate() {
        return checkinDate;
    }

    public void setCheckinDate(String checkinDate) {
        this.checkinDate = checkinDate;
    }

    public String getCheckoutDate() {
        return checkoutDate;
    }

    public void setCheckoutDate(String checkoutDate) {
        this.checkoutDate = checkoutDate;
    }

    public String getNumGuests() {
        return numGuests;
    }

    public void setNumGuests(String numGuests) {
        this.numGuests = numGuests;
    }
}
