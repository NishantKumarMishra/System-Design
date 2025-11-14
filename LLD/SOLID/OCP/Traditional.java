package SOLID.OCP;


//Traditional (Non-OCP) Approach — Changing Code Again & Again
//One class has all payment logic.
//Whenever a new payment method is added → you edit this class, risking bugs.

class PaymentService{
    public void pay(String Method){
        if(Method.equals("UPI")){
            System.out.println("Paying Though UPI......");
        }else if(Method.equals("CARD")){
            System.out.println("Paying Though Card.....");
        }else if(Method.equals("NetBanking")){
            System.out.println("Paying Though NetBanking....");
        }else{
            System.out.println("Invalid Payment Method.....");
        }

    }
}

public class Traditional {
    public static void main(String[] args){
        PaymentService paymentService = new PaymentService();

        paymentService.pay("card");
    }



}
//Problems

// Class keeps growing

// Every new payment method requires modifying this class

// High risk of breaking UPI when adding Card or NetBanking

// Low maintainability
