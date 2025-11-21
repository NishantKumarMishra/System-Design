package Startegy_Factory_Design_Pattern.RideContextDetector;

import Startegy_Factory_Design_Pattern.Situation;
import Startegy_Factory_Design_Pattern.Stategy.LateNightStrategy;
import Startegy_Factory_Design_Pattern.Stategy.PricingStrategy;

public class LateNightContext implements RideContextDetector{
    @Override
    public boolean applied() {
        //In Production level we can call real Time API for checking Late Night
        return Situation.isIs_Late_Night();
    }

    @Override
    public PricingStrategy getPricingStrategy() {
        return new LateNightStrategy();
    }
}
