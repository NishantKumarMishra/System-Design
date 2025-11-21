package Startegy_Factory_Design_Pattern.RideContextDetector;

import Startegy_Factory_Design_Pattern.Stategy.PricingStrategy;

public interface RideContextDetector {
    boolean applied();
    PricingStrategy getPricingStrategy();

}
