package com.HotelResS.TheCodeFellaz.CSVBASE;

import java.io.*;

public class FileReaderPrint {

    public void prtFile(String filename, String userData) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\lmuno\\IdeaProjects\\HotelRes380\\src\\main\\java\\com\\HotelResS\\TheCodeFellaz\\CSVBASE\\Reservations.csv", true));
            writer.write(userData);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getFileInfo(String fname) {
        try {
            BufferedReader read = new BufferedReader(new FileReader(fname));
            String tempStore = read.readLine();
            read.close();
            return tempStore;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}