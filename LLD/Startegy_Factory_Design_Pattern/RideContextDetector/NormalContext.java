package Startegy_Factory_Design_Pattern.RideContextDetector;

import Startegy_Factory_Design_Pattern.Situation;
import Startegy_Factory_Design_Pattern.Stategy.NormalStrategy;
import Startegy_Factory_Design_Pattern.Stategy.PricingStrategy;

public class NormalContext implements RideContextDetector{
    @Override
    public boolean applied() {
        return Situation.isIs_Normal();
    }

    @Override
    public PricingStrategy getPricingStrategy() {
        return new NormalStrategy();
    }
}
