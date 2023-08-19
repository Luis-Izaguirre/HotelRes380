package com.HotelResS.TheCodeFellaz.HotelModel;

public class Invoice {
    private String reservationID;
    private String paymentDate;
    private String paymentTot;
    private boolean Status;
    private Room roomDetails;
    private Payment paymentDetails;
    private Reservation resDetails;


    public Invoice() {
    }

    public Invoice(String confirmationNum, String paymentDate, String paymentTot, boolean status, Room roomDetails, Payment paymentType, Reservation resDetails) {
        this.reservationID = confirmationNum;
        this.paymentDate = paymentDate;
        this.paymentTot = paymentTot;
        this.Status = status;
        this.roomDetails = roomDetails;
        this.resDetails = resDetails;
    }

    public String getConfirmationNum() {
        return reservationID;
    }

    public void setConfirmationNum(String confirmationNum) {
        this.reservationID = confirmationNum;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getPaymentTot() {
        return paymentTot;
    }

    public void setPaymentTot(String paymentTot) {
        this.paymentTot = paymentTot;
    }

    public boolean isStatus() {
        return Status;
    }

    public void setStatus(boolean status) {
        Status = status;
    }

    public String getReservationID() {
        return reservationID;
    }

    public void setReservationID(String reservationID) {
        this.reservationID = reservationID;
    }

    public Room getRoomDetails() {
        return roomDetails;
    }

    public void setRoomDetails(Room roomDetails) {
        this.roomDetails = roomDetails;
    }

    public Payment getPaymentDetails() {
        return paymentDetails;
    }

    public void setPaymentDetails(Payment paymentDetails) {
        this.paymentDetails = paymentDetails;
    }

    public Reservation getReservationDetails() {
        return resDetails;
    }

    public void setReservationDetails(Reservation resDetails) {
        this.resDetails = resDetails;
    }
}
