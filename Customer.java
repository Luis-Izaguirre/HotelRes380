public class Customer{

    public void CreateReservation(String Name, String Contact, int Guests, String CheckInDate, String CheckOutDate, int RoomType)
    {
        Double Fees= 0.00;

        if (RoomType == 1) { //room type determines fees
            Fees = 100.00;
          }

           if (RoomType == 2) {
            Fees = 150.00;
          }
           if (RoomType == 3) {
            Fees = 250.00;
          }
          Date F = new Date();
          Fees = Fees*(F.DateDifference(CheckInDate, CheckOutDate));

    
        CSVReaderPrint B = new CSVReaderPrint(); // adds reservation to the csv file
        B.AddReservation(Name,Contact,Guests,001,RoomType,CheckInDate,"2:00 PM",CheckOutDate,"11:00 AM",Fees,0.00,"No");
    }
}

/*
 * How to Call method
 *  Customer S = new Customer();
        S.CreateReservation("Ori Cohen", "Ori@email.com", 5, "08/19/2023", "08/21/2023", 3);
 */