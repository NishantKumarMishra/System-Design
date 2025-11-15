package SOLID.DIP;

//High-level modules should not depend on low-level modules. Both should depend on abstractions.

//DIP Solution — Depend on Abstraction

//Create an abstraction

interface Notification {
    void send(String message);
}

//Implement concrete classes

class Email_Service implements Notification {
    public void send(String message) {
        System.out.println("Sending Email: " + message);
    }
}
//SMS

class SmsService implements Notification {
    public void send(String message) {
        System.out.println("Sending SMS: " + message);
    }
}
//High-level module depends on interface
class User_Service {
    private Notification notification;  // depends on abstraction

    public User_Service(Notification notification) {
        this.notification = notification;
    }

    public void registerUser(String name) {
        System.out.println("User registered: " + name);
        notification.send(name + " registered successfully!");
    }
}




//Inject implementation at runtime

public class Dependency_Inversion {

    public static void main(String[] args) {

        // Choose the notification type at runtime
        Notification notification = new SmsService();
        // Or: new EmailService();

        User_Service userService = new User_Service(notification);

        userService.registerUser("Nishant");
    }
}
