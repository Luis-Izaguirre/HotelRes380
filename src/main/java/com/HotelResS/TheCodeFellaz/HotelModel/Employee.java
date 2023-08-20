package com.HotelResS.TheCodeFellaz.HotelModel;

import static com.HotelResS.TheCodeFellaz.HotelModel.Hotel.getName;
import static com.HotelResS.TheCodeFellaz.HotelModel.Hotel.setName;

public class Employee {
    private int employeID;
    private boolean roomAvailability;
    private int numCustomers;

    public int getNumCustomers() {
        return numCustomers;
    }

    public void setNumCustomers(int numCustomers) {
        this.numCustomers = numCustomers;
    }

    public int getEmployeID() {
        return employeID;
    }

    public void setEmployeID(int employeID) {
        this.employeID = employeID;
    }

    public boolean isRoomAvailability() {
        return roomAvailability;
    }

    public void setRoomAvailability(boolean roomAvailability) {
        this.roomAvailability = roomAvailability;
    }


    @Override
    public String toString() {

        return "Employee{" +
                "employeID=" + employeID +
                ", roomAvailability=" + roomAvailability +
                ", numCustomers=" + numCustomers +
                '}';
    }
}
