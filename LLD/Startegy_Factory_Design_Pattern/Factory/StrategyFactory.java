package Startegy_Factory_Design_Pattern.Factory;

import Startegy_Factory_Design_Pattern.RideContextDetector.LateNightContext;
import Startegy_Factory_Design_Pattern.RideContextDetector.NormalContext;
import Startegy_Factory_Design_Pattern.RideContextDetector.RideContextDetector;
import Startegy_Factory_Design_Pattern.RideContextDetector.WeatherContext;
import Startegy_Factory_Design_Pattern.Stategy.NormalStrategy;
import Startegy_Factory_Design_Pattern.Stategy.PricingStrategy;

import java.util.ArrayList;
import java.util.List;

public class StrategyFactory {
    public static final List<RideContextDetector> list =List.of(
            new LateNightContext(),
            new WeatherContext(),
            new NormalContext()
    );

    public static PricingStrategy getPricingStrategy(){
        for (RideContextDetector detector : list){
            if (detector.applied()){
                return detector.getPricingStrategy();
            }
        }
        return new NormalStrategy();
    }
}
