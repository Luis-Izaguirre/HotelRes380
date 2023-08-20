package com.HotelResS.TheCodeFellaz.CSVBASE;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class CSVReaderPrint 
{
       public String[][] PrintReservations() {// takes each row of the csv file and adds them to a 2D array
        String line = "";
        String splitBy = ",";//will be used to seperate the vlaues from the csv row format
        boolean firstLineSkipped = false;// used to skip the first line
    
        try {
            BufferedReader br = new BufferedReader(new FileReader("Reservations.csv"));
    
            ArrayList<String[]> reservationsList = new ArrayList<>(); // will be used to store a reservations
    
            while ((line = br.readLine()) != null) {//skips the first row of the csv file
                if (!firstLineSkipped) {
                    firstLineSkipped = true;
                    continue;
                }

    
                String[] reservation = line.split(splitBy);//creates an array and populates it with the values of the row 
                reservationsList.add(reservation); // adds a reservation array to the list
            }
    
            
            int maxIndex = -1; // Find the maximum index value first
            for (String[] reservation : reservationsList) {
                int lastIndex = Integer.parseInt(reservation[reservation.length - 1]);
                if (lastIndex > maxIndex) {
                    maxIndex = lastIndex;
                }
            }
    
            String[][] reservationsArray = new String[maxIndex + 1][]; // Create the 2D array
    
            for (String[] reservation : reservationsList) {
                int lastIndex = Integer.parseInt(reservation[reservation.length - 1]);
                reservationsArray[lastIndex] = reservation; // populates the array at the index
            }

            return reservationsArray;//returns 2d array with all reservations
    
    
        } catch (IOException e) {
            e.printStackTrace();
            
        return null;//error :(
        
        }
    }
    
    

            //addreservation is called by the Customer class and recives its inputs form the CreateReservation method
    public void AddReservation(String Name, String Contact, int Guests, int RoomNum, int RoomType, String CheckInDate, String CheckInTime, String CheckOutDate, String CheckOutTime, Double Fees, Double Discount, String CheckInOutStatus)
    {
        Double Total = Fees - Discount;// calculates total 
        String csvFile = "Reservations.csv"; //writes to the reservation file
        String delimiter = ","; //seperates the inputs with a ","
        int confirmationNumber = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            String line;
            String lastLine = null;
            
            while ((line = br.readLine()) != null) {//looks for the last row in the csv file
                lastLine = line;
            }
            
            if (lastLine != null) {//once the last row is found
                String[] values = lastLine.split(",");//sets the row to an array
                if (values.length > 0) {
                    int lastValue = Integer.parseInt(values[values.length - 1]);//gets the confirmation number from the last row
                    lastValue ++;//adds one to the last confirmation number
                    confirmationNumber = lastValue;//sets the confirmation number for the new reservation
                }
            } else {
                System.out.println("CSV file is empty.");//error
            }
        } catch (IOException e) {
            e.printStackTrace();//bigger error:(
        }
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
                    .append(CheckInOutStatus).append(delimiter)
                    .append(Integer.toString(confirmationNumber)).append("\n");

            System.out.println("Reservation Confirmed!");//for testing only, prints to terminal

            DateRangeGenerator J = new DateRangeGenerator();
        ArrayList<String> S = J.PotentialDates(CheckInDate, CheckOutDate);//takes the check in and check out date and outputs an array with all the dates for the reservation
        System.out.println(S);

        CSVDateUpdater B =new CSVDateUpdater();// updates the Rooms.csv file by adding the reservation dates to the row with the room number for the reservation.
        B.UpdateRoom(S, RoomNum);


        } catch (IOException e) {
            System.out.println("Fail!");//path may be incorrect if printed in terminal or missing inputs. for testing prints to terminal
            e.printStackTrace();

        }
    }

    

    public String searchReservation(String ConfirmationNumber) 
    {
        return GetReservation(ConfirmationNumber);
    }

    public String searchRowByLastValue(String csvFilePath, String targetValue) throws IOException //called by GetReservation method and recieves inputs from that method, finds the reservation information based on name, will be changed to reservation number or customer id later
    {
        String result = null;//variable used to check if the searched value was found or not

        try (BufferedReader br = new BufferedReader(new FileReader(csvFilePath))){// reads the lines of the csv file
            String line;

            while ((line = br.readLine()) != null) {//checks the row to see if it is empty
                String[] values = line.split(",");//adds all the csv values in the row to an array
                if (values.length > 0 && values[13].equals(targetValue)) {//searches the last index and compares it to the search value and if it is the same it will run the code in the if stament and if not then it will move on to the next line untill it is empty
                    result = line; // sets result equal the line the value was found in the csv file
                    break;
                }
            }
        }

        return result;//returns the row that the reservation data was found in 
    }

    public String GetReservation(String Number) {
        String csvFilePath = "Reservations.csv";//searches this file
        String targetValue = Number;//searches for this value at the first value of each row 

        try {
            String foundRow = searchRowByLastValue(csvFilePath, targetValue);// calls method to search for the row with the searched for value, and populates the string foundrow with the data from the row in the csv file
            if (foundRow != null) {// checks to see if the row is empty
                String[] values = foundRow.split(",");//populates an array with the values from the row from the csv file
                if (values.length >= 11) {//checks to see if all the reservation data is there
                    String formattedOutput = //formats the output so the data can me displayed or parsed easily 
                            "Name: " + values[0] + " " +
                            "Email: " + values[1] + " " +
                            "Guest(s): " + values[2] + " " +
                            "Check-In-Date: " + values[5] + " " +
                            "Check-Out-Date: " + values[7] + " " +
                            "Room-Number: " + values[3] + " " +
                            "Room-Type: " + values[4] + " " +
                            "Total: " + values[11] + " " +
                            "Confirmation Number: " + values[13];
                    return formattedOutput;
                } else {
                    return "Not enough values in the row.";//error 
                }
            } else {
                return "Row not found.";//error
            }
        } catch (IOException e) {
            return "Error reading the CSV file: " + e.getMessage();//error wrong path
        }
    }

    public void DeleteRes(String targetValue) throws IOException {//deletes reservation by searching for the confirmation number, moddified version ofsearchRowByLastValue
    String result = null;

    ArrayList<String> lines = new ArrayList<>();

    try (BufferedReader br = new BufferedReader(new FileReader("Reservations.csv"))) {
        String line;

        while ((line = br.readLine()) != null) {//adds the rows in the csv file that do not have the searched for confirmation number to the lines array list
            String[] values = line.split(",");
            if (values.length > 0 && values[13].equals(targetValue)) {
                result = line;//serves no purpouse used to hold deleted value
            } else {
                lines.add(line); // Add the row to the list if it doesn't match the targetValue/ searched for confirmation number
            }
        }
    }

    try (BufferedWriter bw = new BufferedWriter(new FileWriter("Reservations.csv"))) {
        for (String updatedLine : lines) {//rewrites the csv file
            bw.write(updatedLine);
            bw.newLine();
        }
    }

    
}





    public void Discount(String targetValue, double subtractionValue) throws IOException {//adds a discount to a reservation, moddified version ofsearchRowByLastValue
      

        try (BufferedReader br = new BufferedReader(new FileReader("Reservations.csv"))) {
            StringBuilder newContent = new StringBuilder();

            String line;

            while ((line = br.readLine()) != null) {//runs throught each row in the csv
                String[] values = line.split(",");
                
                if (values.length >= 14 && values[13].equals(targetValue)) {//searches for row by confirmation number
                    

                    String ninthValue = values[9].trim(); // finds the 10th value, named ninth value due to misscount
                    double ninthValueDouble = Double.parseDouble(ninthValue.substring(1)); // Remove "$" and convert to double
                    
                    double tenthValue = subtractionValue;//used to replace the 11th value in the csv, named 10th value due to misscount
                    double eleventhValue = ninthValueDouble - subtractionValue;//used to set the new 12th value,named 11th value due to misscount
                    
                    values[10] = String.format("$%.1f", tenthValue); // Format the double with "$" and two decimal places, sets the 11th value to the discount total
                    values[11] = String.format("$%.1f", eleventhValue);//sets the total to include the discount
                    
                    newContent.append(String.join(",", values)).append(System.lineSeparator());//holds the new updated row
                } else {
                    newContent.append(line).append(System.lineSeparator()); //holds the original row
                }
            }

            try (BufferedWriter bw = new BufferedWriter(new FileWriter("Reservations.csv"))) {
                bw.write(newContent.toString());// writes the row being held to the csv
            }
        }

        
    }

    public void CheckInOut(String targetValue, String newValue) throws IOException {//sets check in/ out status to a reservation, moddified version ofsearchRowByLastValue
        

        try (BufferedReader br = new BufferedReader(new FileReader("Reservations.csv"))) {
            StringBuilder newContent = new StringBuilder();

            String line;

            while ((line = br.readLine()) != null) {//runs through each row of the csv file
                String[] values = line.split(",");// sets the current row to an array
                
                if (values.length >= 14 && values[13].equals(targetValue)) {//checks for matching confirmation number
                   

                    values[12] = newValue; //sets the check in/out status from the seccond variable in the function input
                    
                    newContent.append(String.join(",", values)).append(System.lineSeparator());// holds the new modified row 
                } else {
                    newContent.append(line).append(System.lineSeparator());//holds a row that was not modified 
                }
            }

            try (BufferedWriter bw = new BufferedWriter(new FileWriter("Reservations.csv"))) {
                bw.write(newContent.toString());//writes the rows back to the csv file
            }
        }

        
    }




}

