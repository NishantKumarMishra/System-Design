package Startegy_Factory_Design_Pattern.RideContextDetector;

import Startegy_Factory_Design_Pattern.Situation;
import Startegy_Factory_Design_Pattern.Stategy.PricingStrategy;
import Startegy_Factory_Design_Pattern.Stategy.WeatherStrategy;

public class WeatherContext implements RideContextDetector{
    @Override
    public boolean applied() {
        return Situation.isIs_Bad_Weather();
    }

    @Override
    public PricingStrategy getPricingStrategy() {
        return new WeatherStrategy();
    }
}
