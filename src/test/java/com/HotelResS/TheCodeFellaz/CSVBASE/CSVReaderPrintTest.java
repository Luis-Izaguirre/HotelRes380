package com.HotelResS.TheCodeFellaz.CSVBASE;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CSVReaderPrintTest {

    @Test
    void searchReservation() {
        var print = new CSVReaderPrint();
        assertEquals( "10000",print.searchReservation("10000") ); ;

    }

    @Test
    void checkInOut() {
    }
}