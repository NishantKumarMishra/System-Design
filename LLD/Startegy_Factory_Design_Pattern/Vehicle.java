package Startegy_Factory_Design_Pattern;

import Startegy_Factory_Design_Pattern.Factory.StrategyFactory;
import Startegy_Factory_Design_Pattern.Stategy.PricingStrategy;



public class Vehicle {

    private PricingStrategy pricingStrategy;

    Vehicle(PricingStrategy pricingStrategy){
        this.pricingStrategy = pricingStrategy;
    }

    double bookVehicle(double dis){
        return pricingStrategy.calculateFare(dis);
    }


}

// Mini Vehicle

class Mini extends Vehicle{
    Mini(){
        super(StrategyFactory.getPricingStrategy());
    }
}

// sedan vehicle

class Sedan extends Vehicle{
    Sedan(){
        super(StrategyFactory.getPricingStrategy());
    }
}
