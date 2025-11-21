package Startegy_Factory_Design_Pattern;

import Startegy_Factory_Design_Pattern.Stategy.LateNightStrategy;
import Startegy_Factory_Design_Pattern.Stategy.NormalStrategy;
import Startegy_Factory_Design_Pattern.Stategy.PricingStrategy;
import Startegy_Factory_Design_Pattern.Stategy.WeatherStrategy;

import java.util.HashMap;

public class FareRedis {
    public static final HashMap<String,Double> Fare = new HashMap<>();
    FareRedis(){
        Fare.put("Normal",50.0);
        Fare.put("Bad_Weather",70.0);
        Fare.put("LateNight",90.0);

    }
    public static double  getFare(String condition){
        return Fare.get(condition);
    }

}
