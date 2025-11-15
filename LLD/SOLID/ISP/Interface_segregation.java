package SOLID.ISP;

//Don’t force classes to implement methods they don’t need.

interface SendNotification {
    Boolean send();
}

class SMSNotification implements SendNotification{

    String Number;

    public SMSNotification(String number) {
        Number = number;
    }

    @Override
    public Boolean send() {
        System.out.println("Send Notification to SMS.......");
        return true;
    }
}

class EmailNotification implements SendNotification{

    String email;

    public EmailNotification(String email) {
        this.email = email;
    }

    @Override
    public Boolean send() {
        System.out.println("Send Notification to Email.......");
        return null;
    }
}

class PushNotification implements SendNotification{
    @Override
    public Boolean send() {
        System.out.println("Sending Push Notification.......");
        return null;
    }
}

 class NotificationService {

    public void notifyUser(SendNotification notification) {
        notification.send();
    }
}


public class Interface_segregation {

  public static void main(String[] args){
      NotificationService service = new NotificationService();

      //send though email
      service.notifyUser(new EmailNotification("youremail@gmail.com"));

      //send though sms

      service.notifyUser(new SMSNotification("999999999"));

  }


}

//Interface has only one behavior → send()

    //    Classes implement only what they need

  //      Easy to extend (add WhatsApp, Slack, Telegram, etc.)

//        No empty or unused methods

  //      Clean, scalable, maintainable design
