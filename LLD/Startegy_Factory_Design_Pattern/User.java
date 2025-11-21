package Startegy_Factory_Design_Pattern;

import java.util.Scanner;

public class User {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        FareRedis radis = new FareRedis();
        System.out.println("Enter KiloMeters....");
        Double dis = sc.nextDouble();
        Vehicle vehicle = new Mini();
        double Fare_Price = vehicle.bookVehicle(dis);


        System.out.println("Your fare Price for this Tripe is "+ Fare_Price);



    }
}
