public class SecondsMinutes {
    public static String getDurationString(int minutes, int seconds){
        if((minutes< 0)|| ((seconds < 0) || (seconds >59))) {
            return "Invalid value";
        }
        else {
            int hours;
            hours = minutes / 60;
            int newminutes = minutes % 60;


            String finalhour = hours+"h";
            if(hours< 10) {
                 finalhour = "0" + finalhour;
            }

            String finalminute = newminutes+"m";
            if(newminutes< 10) {
                finalminute = "0" + finalminute;
            }

            String finalsecond = seconds+"s";
            if(seconds< 10) {
                finalsecond = "0" + finalsecond;
            }


                return finalhour+" "+finalminute+" "+finalsecond;
        }
    }
    public static String getDurationString(int seconds){
        if(seconds< 0)
            return "Invalid value";
        else {
            int minutes = seconds / 60;
            int newseconds = seconds % 60;

            return SecondsMinutes.getDurationString(minutes,newseconds);
        }
    }
}
