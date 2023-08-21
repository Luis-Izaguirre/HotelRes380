package com.HotelResS.TheCodeFellaz.HotelModel;

import com.HotelResS.TheCodeFellaz.CSVBASE.CustomerFees;

public class Customer {

    private String name;
    private String email;
    private String phone;


    public Customer(){}

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
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
       // email = email
        this.email = email;
    }

    public void modifyCustomer(String name, String email){

        this.name = name;
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    private void printReservation(){
        CustomerFees S = new CustomerFees();

        S.CreateReservation("Ori Cohen", "Ori@email.com", 5, "08/19/2023", "08/25/2023", 301);
    }

}
