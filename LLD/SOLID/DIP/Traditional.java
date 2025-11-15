package SOLID.DIP;

class EmailService{
    public void sendEmail(String name){
        System.out.println("Sending Register Mail.......");
    }
}

class UserService {
    EmailService email = new EmailService();  // BAD: depends on concrete class

    public void registerUser(String name) {
        System.out.println("User registered: " + name);
        email.sendEmail(name + " registered!"); // depends only on Email
    }
}


public class Traditional {
    public static void main(String[] args){
        UserService service = new UserService();


        service.registerUser("your name");
    }

}

//    UserService depends directly on EmailService
//
//        If tomorrow business says:
//
//        "Send SMS instead of Email"
//
//        "Send WhatsApp"
//
//        "Send Push Notification"
//
//        You must open and change UserService, risking bugs.
//
//        Hard to test (requires real EmailService)
