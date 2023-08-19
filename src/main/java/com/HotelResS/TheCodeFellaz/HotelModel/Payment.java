package com.HotelResS.TheCodeFellaz.HotelModel;

import org.springframework.stereotype.Component;

public class Payment {
    private String nameVerify;
    private String cardNum;

    private String expDate;
    private String cvc;

    public Payment() {
    }

    public Payment(String nameVerify, String cardNum, String expDate, String cvc) {
        this.nameVerify = nameVerify;
        this.cardNum = cardNum;
        this.expDate = expDate;
        this.cvc = cvc;
    }

    public String getNameVerify() {
        return nameVerify;
    }

    public void setNameVerify(String nameVerify) {
        this.nameVerify = nameVerify;
    }

    public String getCardNum() {
        return cardNum;
    }

    public void setCardNum(String cardNum) {
        this.cardNum = cardNum;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    public String getCvc() {
        return cvc;
    }

    public void setCvc(String cvc) {
        this.cvc = cvc;
    }
}
