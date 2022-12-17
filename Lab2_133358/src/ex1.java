
import java.util.Scanner;
public class ex1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //call the scanner
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the destance in meters: "); //read destance
        Float destanceM = in.nextFloat();
        System.out.print("Enter the time in seconds: "); //read time
        Float timeS = in.nextFloat();
        //convert to km/h
        Float destanceK = destanceM/1000 ;
        Float timeH = timeS/3600;

        //print speed
        System.out.printf("\n The speed in m/s is %.2f\n " , destanceM/timeS);

        System.out.printf("The speed in km/h is %.2f\n" , destanceK/timeH);



    }

}
