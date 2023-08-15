package HotelFunc;

import java.util.HashMap;
import java.util.Map;

public class Login {
    
    public enum UserRole {
    RECEPTIONIST,
    MANAGER,
    GUEST;
}

public class User {
    private int id;
    private String username;
    private String password;
    private UserRole role;

    public User(int id, String username, String password, UserRole role) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.role = role;
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
