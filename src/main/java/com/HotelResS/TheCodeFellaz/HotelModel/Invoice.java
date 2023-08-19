package com.HotelResS.TheCodeFellaz.HotelModel;

import java.util.*;

public class Invoice {
    private String confirmationNum;
    private String paymentDate;
    private String paymentTot;
    private boolean Status;

    public Invoice() {
    }

    public Invoice(String confirmationNum, String paymentDate, String paymentTot, boolean status) {
        this.confirmationNum = confirmationNum;
        this.paymentDate = paymentDate;
        this.paymentTot = paymentTot;
        this.Status = status;
    }

    public String getConfirmationNum() {
        return confirmationNum;
    }

    public void setConfirmationNum(String confirmationNum) {
        this.confirmationNum = confirmationNum;
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
}
