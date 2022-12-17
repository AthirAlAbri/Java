

//import scanner
import java.util.Scanner;

public class Lab2_practice {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter number of gallons of gas in tank: " );
    Float numOfGallons = in.nextFloat();
    System.out.print("Enter fuel efficiency of car: " );
    Float fuelEfficiency = in.nextFloat();
    System.out.print("Enter the price of gas per gallon: " );
    Float price = in.nextFloat();
    System.out.print("=========================================================================\n");
    System.out.printf( "%-17s %-17s %-17s", "Gallon of gaz", "Fuel" ,"Gallon ");
    System.out.printf("%-17s %-17s %-17s","\nin tank", " efficiency" ,  " price" ) ;
    System.out.print("\n=========================================================================\n");
    System.out.printf("%-17.2f %-17.2f %-17.2f ", numOfGallons, fuelEfficiency, price );
















    }
}
