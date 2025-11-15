package SOLID.ISP;


// A single interface force every Notification service to implement every Method

 interface Notification{
    void sendEmail();
    void sendSMS();
    void sendPushNotification();
}

class PushNotificationService implements Notification {

    @Override
    public void sendEmail() {
        //  Useless
    }

    @Override
    public void sendSMS() {
        //  Useless
    }

    @Override
    public void sendPushNotification() {
        System.out.println("Sending push notification...");
    }
}


public class Traditional {
     PushNotificationService service = new PushNotificationService();

}

// Problems

//        Violates ISP

//        Hard to maintain

//        Immature interface design

//Pollutes code with empty methods
