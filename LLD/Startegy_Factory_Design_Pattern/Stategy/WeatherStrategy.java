package Startegy_Factory_Design_Pattern.Stategy;

import Startegy_Factory_Design_Pattern.FareRedis;

public class WeatherStrategy implements PricingStrategy{
    @Override
    public double calculateFare(double dis ) {
        double fare = FareRedis.getFare("Bad_Weather");
        return dis*fare;
    }
}
