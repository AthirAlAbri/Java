/*
 * Purpose: 
 *          Write a Java program to generate twenty random integers 
 *          in a specific range
 * Input: range
 * Output: random numbers
 */

import java.util.Random;
import java.util.Scanner;

/**
 * COMP2202
 * Sec20
 * @author yessine
 */
public class Exercise1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        int start = 0;
        int end = 0;
        // get the starting
        System.out.print("Input the starting number of the range: ");
        start = in.nextInt();

        // validate input
        do {
            // get the ending
            System.out.print("Input the ending number of the range: ");
            end = in.nextInt();
        } while (start > end);

        // loop to generate 20 numbers
        for (int i = 0; i < 20; i++) {

            System.out.printf("%2d",
                    rand.nextInt(start, end + 1));
            if (i % 5 == 4) {
                System.out.println("");
            } else {
                System.out.print(", ");
            }
        }

    }

}