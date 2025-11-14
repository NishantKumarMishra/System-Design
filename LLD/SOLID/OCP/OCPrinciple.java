package SOLID.OCP;

//Open/Closed Principle (OCP)

//Classes should be open for extension, but closed for modification.

//So we will not modify old code, we will only add new classes.

interface Payment{
    public void pay();
}

class UPIPayment implements Payment{

    @Override
    public void pay() {
        System.out.println("Paying Though UPI......");
    }
}

class CardPayment implements Payment{

    @Override
    public void pay(){
        System.out.println("Paying Though Card.....");
    }
}

class NetBankingPayment implements Payment{

    @Override
    public void pay(){
        System.out.println("Paying Though NetBanking.....");
    }
}

class Payment_Service{

    public void processPayment(Payment paymentMethod){
        paymentMethod.pay();
    }

}

public class OCPrinciple {

    public static void main(String [] args){
        Payment_Service service = new Payment_Service();
        // Pay using UPI
        service.processPayment(new UPIPayment());

        // Pay using Card
        service.processPayment(new CardPayment());

        // Pay using NetBanking
        service.processPayment(new NetBankingPayment());
    }
}


