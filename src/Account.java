import java.util.ArrayList;

public abstract class Account {

    // Var:
    enum Permissions {

    }

    String username;
    String password;
    ArrayList notificationList;
    Boolean isLoggedIn;

    // Methods:
    void login() {
        isLoggedIn = true;
    }

    void logout() {
        isLoggedIn = false;
    }

    void viewChart() {
        
    }

    void updateChart() {

    }
}
