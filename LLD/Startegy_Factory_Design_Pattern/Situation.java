package Startegy_Factory_Design_Pattern;

public class Situation {
    private static boolean is_Late_Night = true;
    private static boolean is_Bad_Weather = false;
    private static boolean is_Normal = false;

    public static boolean isIs_Late_Night() {
        return is_Late_Night;
    }

    public static void setIs_Late_Night(boolean is_Late_Night) {
        Situation.is_Late_Night = is_Late_Night;
    }

    public static boolean isIs_Bad_Weather() {
        return is_Bad_Weather;
    }

    public static void setIs_Bad_Weather(boolean is_Bad_Weather) {
        Situation.is_Bad_Weather = is_Bad_Weather;
    }

    public static boolean isIs_Normal() {
        return is_Normal;
    }

    public static void setIs_Normal(boolean is_Normal) {
        Situation.is_Normal = is_Normal;
    }



}
