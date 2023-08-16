package com.HotelResS.TheCodeFellaz;

public class Customer{

    public void CreateReservation(String Name, String Contact, int Guests, String CheckInDate, String CheckOutDate, int RoomType)
    {
        Double Fees= 0.00;// calculate the fees based on room type and number of nights of the stay
      //room type determines fees, room types will be determined before the method call
        if (RoomType == 1) { //roomtype 1 is a single bed room
            Fees = 100.00;
          }

           if (RoomType == 2) {//roomtype 2 is a double bed room
            Fees = 150.00;
          }
           if (RoomType == 3) { //roomtype 3 is a suite with multiple rooms
            Fees = 250.00;
          }
          Date F = new Date();
          Fees = Fees*(F.DateDifference(CheckInDate, CheckOutDate));//calls method to calculate number of nights based on the dates and multiplies it by the fees per night to calculate the fees before any discounts

    
        CSVReaderPrint B = new CSVReaderPrint(); // adds reservation to the csv file
        B.AddReservation(Name,Contact,Guests,001,RoomType,CheckInDate,"2:00 PM",CheckOutDate,"11:00 AM",Fees,0.00,"No");//check in time, check out time, discounts, and checkin/out status are hard coded and some can be manipulated later
    }
}

/*
 * How to Call method
 *  Customer S = new Customer();
        S.CreateReservation("Ori Cohen", "Ori@email.com", 5, "08/19/2023", "08/21/2023", 3);
 */