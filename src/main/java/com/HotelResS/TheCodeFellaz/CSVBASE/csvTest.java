package com.HotelResS.TheCodeFellaz.CSVBASE;

import com.HotelResS.TheCodeFellaz.CSVBASE.CSVReaderPrint;

public class csvTest {
    public static void main(String[] args) throws Exception{
        CSVReaderPrint print = new CSVReaderPrint();
        print.AddReservation("Bob Cohen","Bob.Cohen@gmail.com",7,401,1,"9/19/2023","2:00 PM","09/23/23","11:00 AM",1900.00,0.00,"No");
        print.AddReservation("Bob Daniels","Bob.Dn@gmail.com",7,402,2,"9/19/2023","2:00 PM","09/23/23","11:00 AM",1900.00,0.00,"No");
        print.AddReservation("Bobby Boucher","Bob.B@gmail.com",7,403,3,"9/19/2023","2:00 PM","09/23/23","11:00 AM",1900.00,0.00,"No");
        print.AddReservation("Billy Bob","Bob.BB@gmail.com",7,404,4,"9/19/2023","2:00 PM","09/23/23","11:00 AM",1900.00,0.00,"No");
        print.PrintReservations();
    }
}
