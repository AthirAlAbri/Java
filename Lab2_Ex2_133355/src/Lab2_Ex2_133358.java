
//importing scanner
import java.util.Scanner;
public class Lab2_Ex2_133358 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //set variables types
        int i = 1;
        int count = 0;
        double sum = 0;
        double average;
        int mark=0;

        //asking the user to enter marks 3 times
        //using while loop
        while (i < 4) {
            System.out.print("Enter the mark (0-100) for student " + i + ": ");

            //validate correct data type
            if ( in.hasNextInt()) {
                mark = in.nextInt();
            } else
            {
                System.out.println("Error: not integer value...Exit");
                System.exit(0);
            }

            //input validation
            if ( mark >= 0 && mark <= 100) {
                i++;
                count++;
                sum = sum + mark;


            } else {
                System.out.print("Invalid input, try again...\n");
            }

        }
        average = sum / count;
        System.out.printf("The average is: %.2f", average);

    }
}
