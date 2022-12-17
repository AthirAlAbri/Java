/*
 * Purpose: 
 *          Write a Java program that constructs 2 pts then display 
 *          the distancfe between them
 * Input: coordinates of the 2 points
 * Output: distance
 */

import java.awt.Point;
import java.util.Scanner;

/**
 * COMP2202
 * Sec20
 * @author yessine
 */
public class Exercise2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
                
        // get the 1st point coordinates
        System.out.print("Input 1st point coordinates (x, y): ");
        
        int x = in.nextInt();
        int y = in.nextInt();
        Point p1 = new Point( x, y);
        
         // get the 2nd point coordinates
        System.out.print("Input 2nd point coordinates (x, y): ");
        
        x = in.nextInt();
        y = in.nextInt();
        Point p2 = new Point( x, y);

        // calculate and display distance by using pythagore formula
        double distance = Math.sqrt( 
                Math.pow(p1.getX()-p2.getX(),2) + 
                Math.pow(p1.getY()-p2.getY(),2) );
        System.out.printf("Distance between them: %.2f\n", distance);
        
        // calculate and dispaly distance by using point method
        distance = p1.distance(p2);
        System.out.printf("Distance between them: %.2f\n", distance);

    }

}