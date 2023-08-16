import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class CSVReaderPrint 
{
    public void PrintReservations()
    {
        
        String line = "";
        String splitBy = ",";
        boolean firstLineSkipped = false; 

        try {
            
            BufferedReader br = new BufferedReader(new FileReader("Reservations.csv"));

            while ((line = br.readLine()) != null) { //skips first line in the csv file.
                if (!firstLineSkipped) {
                    firstLineSkipped = true;
                    continue; 
                }

                String[] reservation = line.split(splitBy);// formats and prints the data from the Reservations.csv file.
                System.out.println("Customer's Name: " + reservation[0] + ", Contact: " + reservation[1] + ", Guest(s): " + reservation[2] + ", Room Number: " + reservation[3] + ", Room Type: " + reservation[4] + ", Check In Date: " + reservation[5] + ", Check In Time: " + reservation[6] + ", Check Out Date: " + reservation[7] + ", Check Out Time: " + reservation[8] + ", Fees: " + reservation[9] + ", Discount: " + reservation[10] + ", Total: " + reservation[11] + ", Check in/out status: " + reservation[12]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    } 

    public void AddReservation(String Name, String Contact, int Guests, int RoomNum, int RoomType, String CheckInDate, String CheckInTime, String CheckOutDate, String CheckOutTime, Double Fees, Double Discount, String CheckInOutStatus){
        Double Total = Fees - Discount;// calculates total 
        String csvFile = "Reservations.csv";
        String delimiter = ","; //seperates the inputs with a ","

        try (FileWriter writer = new FileWriter(csvFile, true)) {//prints to a new line on the Reservations.csv file.
            
            writer.append(Name).append(delimiter)//prints and formats the input to the Reservations.csv file.
                    .append(Contact).append(delimiter)
                    .append(Integer.toString(Guests)).append(delimiter)
                    .append(Integer.toString(RoomNum)).append(delimiter)
                    .append(Integer.toString(RoomType)).append(delimiter)
                    .append(CheckInDate).append(delimiter)
                    .append(CheckInTime).append(delimiter)
                    .append(CheckOutDate).append(delimiter)
                    .append(CheckOutTime).append(delimiter)
                    .append("$"+Double.toString(Fees)).append(delimiter)
                    .append("$"+Double.toString(Discount)).append(delimiter)
                    .append("$"+Double.toString(Total)).append(delimiter)
                    .append(CheckInOutStatus).append("\n");

            System.out.println("Reservation Confirmed!");

        } catch (IOException e) {
            System.out.println("Fail!");//path may be incorrect if printed in terminal or missing inputs.
            e.printStackTrace();

        }
    }

    public String ReturnReservation(String NameIn) {
        return GetReservation(NameIn);
    }

    public String searchRowByFirstValue(String csvFilePath, String targetValue) throws IOException {
        String result = null;

        try (BufferedReader br = new BufferedReader(new FileReader(csvFilePath))) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                if (values.length > 0 && values[0].equals(targetValue)) {
                    result = line;
                    break;
                }
            }
        }

        return result;
    }

    public String GetReservation(String Name) {
        String csvFilePath = "Reservations.csv";
        String targetValue = Name;

        try {
            String foundRow = searchRowByFirstValue(csvFilePath, targetValue);
            if (foundRow != null) {
                String[] values = foundRow.split(",");
                if (values.length >= 7) {
                    String formattedOutput =
                            "Name: " + values[0] + " " +
                            "Email: " + values[1] + " " +
                            "Guest(s): " + values[2] + " " +
                            "Check-In-Date: " + values[5] + " " +
                            "Check-Out-Date: " + values[7] + " " +
                            "Room-Number: " + values[3] + " " +
                            "Room-Type: " + values[4];
                    return formattedOutput;
                } else {
                    return "Not enough values in the row.";
                }
            } else {
                return "Row not found.";
            }
        } catch (IOException e) {
            return "Error reading the CSV file: " + e.getMessage();
        }
    }

}


/*
 * How to Call methods
 * CSVReaderPrint S = new CSVReaderPrint();
        S.AddReservation("Bob Cohen","Bob.Cohen@gmail.com",7,401,4,"9/19/2023","2:00 PM","09/23/23","11:00 AM",1900.00,0.00,"No");

   CSVReaderPrint G = new CSVReaderPrint();
        G.PrintReservations();
 */