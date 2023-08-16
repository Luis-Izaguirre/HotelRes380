package HotelFunc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import HotelModel.Employee;

public class Login {
    

public class User {
    
    Employee employee = new Employee();
    Manger manager = new Manger();
    private int id;
    private String username;
    private String password;
    

    public User(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }
}


 public void PrintReservations()
    {
        
        String line = "";
        String splitBy = ",";
        boolean firstLineSkipped = false; 

        try {
            
            BufferedReader br = new BufferedReader(new FileReader("Reservations.csv"));

            while ((line = br.readLine()) != null) { //skips first line in the csv file
                if (!firstLineSkipped) {
                    firstLineSkipped = true;
                    continue; 
                }

                String[] reservation = line.split(splitBy);
                System.out.println("Customer's Name: " + reservation[0] + ", Contact: " + reservation[1] + ", Guest(s): " + reservation[2] + ", Room Number: " + reservation[3] + ", Room Type: " + reservation[4] + ", Check In Date: " + reservation[5] + ", Check In Time: " + reservation[6] + ", Check Out Date: " + reservation[7] + ", Check Out Time: " + reservation[8] + ", Fees: " + reservation[9] + ", Discount: " + reservation[10] + ", Total: " + reservation[11] + ", Check in/out status: " + reservation[12]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    } 


 private Map<String, User> users = new HashMap<>();

    public Login() {
        // Sample users. In a real application, these would come from a database.
        users.put("manager1", new User(1, "manager1", "password123", UserRole.MANAGER));
        users.put("receptionist1", new User(2, "receptionist1", "password123", UserRole.RECEPTIONIST));
        users.put("guest1", new User(3, "guest1", "password123", UserRole.GUEST));
    }

    public User loginUser(String username, String password) {
        User user = users.get(username);

        if (user != null && user.getPassword().equals(password)) {
            return user;
        }

        return null;
    }

}
