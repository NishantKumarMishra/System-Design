package Startegy_Factory_Design_Pattern.Stategy;

import Startegy_Factory_Design_Pattern.FareRedis;

public class LateNightStrategy implements PricingStrategy{
    @Override
    public double calculateFare(double dis ) {
        double fare = FareRedis.getFare("LateNight");
        return dis*fare;
    }
}
