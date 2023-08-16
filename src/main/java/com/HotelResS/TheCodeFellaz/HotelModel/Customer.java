package com.HotelResS.TheCodeFellaz.HotelModel;

public class Customer {

    private String name;
    private String numGuests;
    private String email;
    private String phone;
    private String checkInDate;
    private String checkOutDate;

    public Customer(){}
    public Customer(String name, String numGuests, String email, String phone, String checkInDate, String checkOutDate){
        this.numGuests = numGuests;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }


    public String getNumGuests() {
        return numGuests;
    }

    public void setNumGuests(String numGuests) {
        this.numGuests = numGuests;
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

    public static Customer createCustomer(String name, String numGuests, String email, String phone, String checkIN, String checkOut){
        //Create a new Customer
        return new Customer(name, numGuests, email, phone, checkIN, checkOut);
    }

    public void modifyCustomer(String name, String numGuests,String email, String phone, String checkIN, String checkOut){
        this.numGuests = numGuests;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.checkInDate = checkIN;
        this.checkOutDate = checkOut;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", numGuests='" + numGuests + '\'' +
                ", checkInDate='" + checkInDate + '\'' +
                ", checkOutDate='" + checkOutDate + '\'' +
                '}';
    }
}
