package com.HotelResS.TheCodeFellaz.CSVBASE;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class CSVReaderPrint 
{
    // prints all the reservations from the csv file in a readable format to the terminal, its primary purpose is for testing but will be adapted later
    public void PrintReservations()
    {
        
        String line = ""; //used to check if the next line is empty
        String splitBy = ",";//used to diferentiate between the values in the csv file
        boolean firstLineSkipped = false; //used to skip the first line of the csv file that is not used by the code

        try {
            
            BufferedReader br = new BufferedReader(new FileReader("Reservations.csv")); //calling the bufferedreader method to read from the reservation csv file, reservation.csv file must be in the same folder as this class to work

            while ((line = br.readLine()) != null) { //checks that the next line is not empty for the loop
                if (!firstLineSkipped) {//skips first line in the csv file.
                    firstLineSkipped = true;
                    continue; 
                }

                String[] reservation = line.split(splitBy);//takes each value for the row in a csv file and adds it to an array which the print statment bellow will use
                // formats and prints the data from the Reservations.csv file.VVV
                System.out.println("Customer's Name: " + reservation[0] + ", Contact: " + reservation[1] + ", Guest(s): " + reservation[2] + ", Room Number: " + reservation[3] + ", Room Type: " + reservation[4] + ", Check In Date: " + reservation[5] + ", Check In Time: " + reservation[6] + ", Check Out Date: " + reservation[7] + ", Check Out Time: " + reservation[8] + ", Fees: " + reservation[9] + ", Discount: " + reservation[10] + ", Total: " + reservation[11] + ", Check in/out status: " + reservation[12]);
            }
        } catch (IOException e) {
            e.printStackTrace();//if the code goes here something went wrong :(
        }
    } 

    //addreservation is called by the Customer class and recives its inputs form the CreateReservation method
    public void AddReservation(String Name, String Contact, int Guests, int RoomNum, int RoomType, String CheckInDate, String CheckInTime, String CheckOutDate, String CheckOutTime, Double Fees, Double Discount, String CheckInOutStatus)
    {
        Double Total = Fees - Discount;// calculates total 
        String csvFile = "Reservations.csv"; //writes to the reservation file
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

            System.out.println("Reservation Confirmed!");//for testing only, prints to terminal

        } catch (IOException e) {
            System.out.println("Fail!");//path may be incorrect if printed in terminal or missing inputs. for testing prints to terminal
            e.printStackTrace();

        }
    }

    public String ReturnReservation(String NameIn) 
    {
        return GetReservation(NameIn);
    }

    public String searchRowByFirstValue(String csvFilePath, String targetValue) throws IOException //called by GetReservation method and recieves inputs from that method, finds the reservation information based on name, will be changed to reservation number or customer id later
    {
        String result = null;//variable used to check if the searched value was found or not

        try (BufferedReader br = new BufferedReader(new FileReader(csvFilePath))){// reads the lines of the csv file
            String line;

            while ((line = br.readLine()) != null) {//checks the row to see if it is empty
                String[] values = line.split(",");//adds all the csv values in the row to an array
                if (values.length > 0 && values[0].equals(targetValue)) {//searches the first index and compares it to the search value and if it is the same it will run the code in the if stament and if not then it will move on to the next line untill it is empty
                    result = line; // sets result equal the line the value was found in the csv file
                    break;
                }
            }
        }

        return result;//returns the row that the reservation data was found in 
    }

    public String GetReservation(String Name) {
        String csvFilePath = "Reservations.csv";//searches this file
        String targetValue = Name;//searches for this value at the first value of each row 

        try {
            String foundRow = searchRowByFirstValue(csvFilePath, targetValue);// calls method to search for the row with the searched for value, and populates the string foundrow with the data from the row in the csv file
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
                            "Room-Type: " + values[4];
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

}


/*
 * How to Call methods
 * CSVReaderPrint S = new CSVReaderPrint();
        S.AddReservation("Bob Cohen","Bob.Cohen@gmail.com",7,401,4,"9/19/2023","2:00 PM","09/23/23","11:00 AM",1900.00,0.00,"No");

   CSVReaderPrint G = new CSVReaderPrint();
        G.PrintReservations();

          CSVReaderPrint J = new CSVReaderPrint();
        System.out.println(J.ReturnReservation("Ori Cohen"));
 */