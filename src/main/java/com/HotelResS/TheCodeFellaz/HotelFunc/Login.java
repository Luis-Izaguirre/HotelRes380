
package com.HotelResS.TheCodeFellaz.HotelFunc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Login {

    
    Employee employee = new Employee();
    Manger manager = new Manger();
    
    private String username;
    private String password;
    private String accountType;
    private boolean loginKey;
    

    public Login( String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername()
    {
        return username;
    }

    public String getPassword()
    {
        return password;
    }

    public String getAccountType()
    {
        return accountType;
    }
    
    public void setUsername(String username)
    {
        this.username = username;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public void setAccountType(String accountType)
    {
        this.accountType = accountType;
    }


//This method returns a boolean, based on the username and password provided by the user
 public boolean loginUser(String inputUsername, String inputPassword)
    {
        
        String line = "";
        String splitBy = ",";
        boolean firstLineSkipped = false; 

        try {
            
            BufferedReader br = new BufferedReader(new FileReader("user_accounts.csv"));

            while ((line = br.readLine()) != null) { //skips first line in the csv file
                if (!firstLineSkipped) {
                    firstLineSkipped = true;
                    continue; 
                }

                //array of strings that checks username, password, and account type
                //username and pass 
                String[] userData = line.split(splitBy);
                String username = userData[0];
                String password = userData[1];
                String accountType = userData[2];

                //user validation
                if (inputUsername.equals(username) && inputPassword.equals(password))
                {
                    return loginKey;
                }

        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return null;
    } 

/* Potential use of map to authenticate user login NOT apart of submission
 private Map<String, User> users = new HashMap<>();

    public Login() {
        
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
*/
}
}