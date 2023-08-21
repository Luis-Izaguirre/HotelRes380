package com.HotelResS.TheCodeFellaz.CSVBASE;

import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class FileReaderPrintTest {

    @Test
    void prtFile() {
        FileReaderPrint f = new FileReaderPrint();
        String str = "Hello World";
        f.prtFile("random", str );
        System.out.println(f.getFileInfo("random"));
    }

    @Test
    void getFileInfo() {
    }
}