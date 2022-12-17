package w7Lab6.employee;

public class Employee {
    //instance variables
    private int workedHours;
    private int regularWorked;
    private double hourlyRate;

    private static double overTime = 1.5;


    public Employee(int wh, int rwh, double hr){
        this.workedHours = wh;
        this.regularWorked = rwh;
        this.hourlyRate = hr;

    }

    public double computePayCheck(){
        double totalPayment = 0;
        if( workedHours > regularWorked){
            int overtimeHoures;
        }

    }
}
