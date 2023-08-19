package com.HotelResS.TheCodeFellaz.IncomeReceipt;

import java.util.*;

public class Invoice {
    private String invoiceNumber;
    private Date paymentDate;
    private int idCustomer;
    private int total;
    private boolean status;

    public Invoice(String invoiceNumber, Date paymentDate, int idCustomer, int total) {
        this.invoiceNumber = invoiceNumber;
        this.paymentDate = paymentDate;
        this.idCustomer = idCustomer;
        this.total = total;
    }

}
