

public class Clock {
    String hours;
    String min;
    String time;


    public String getHours(){
        hours = java.time.LocalTime.now().toString().substring(0,2);
        return hours;
    }

    public String getMinutes(){
        min = java.time.LocalTime.now().toString().substring(3,5);
        return min;
    }

    public String getTime(){
        time = getHours()+ ":" +getMinutes() ;
        return time;
    }


}
