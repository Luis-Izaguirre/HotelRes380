package com.HotelResS.TheCodeFellaz.CSVBASE;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CSVReaderPrintTest {

    @Test
    void addReservation() {

        FileReaderPrint f = new FileReaderPrint();
        f.prtFile("6", "7866");
        assertEquals(f.getFileInfo(""), "7866");

    }

    @Test
    void searchRowByLastValue() {
        var v = new CSVReaderPrint();
        assertEquals("000",v.searchReservation("10000"));

    }
}