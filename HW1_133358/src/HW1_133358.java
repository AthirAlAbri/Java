/*

Name: Athir Alabri
ID: 133358
Section: 20

Input: dimensions of the given rectangle,  number of randomly generated rectangles
Output: information about random rectangles, number of contained corners,
number of randomly generated rectangles with no-overlap

Purpose: The purpose of this assignment is to practice Java data types, constructing objects, and basic Java constructs
(decisions and loops).

Algorithm:
1. import packages
2. create objects
3. create the given rectangle and validate the inputs
4. ask the user how many random rectangle wants to create
5. create a rectangle using Random and update the dimensions in the loop to the number of random generated rectangles
6. check contained corners
7. check randomly generated rectangles with no-overlap
8. print formatted outputs

 */

//import scanner, random, rectangle, point
import java.awt.*;
import java.util.Scanner;
import java.util.Random;


public class HW1_133358 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); //declare scanner .
        Random random = new Random(); // declare random .
        //Point point= new Point(); // declare point.
        Rectangle givenRectangle = null;
        int width = 0;
        int height = 0;


        System.out.print("Please enter the width and the height of the given rectangle: ");
        //check if the inputs are valid
        if (in.hasNextInt()) {

             width = in.nextInt();
             height = in.nextInt();
            while (width < 10 || width > 100 || height < 10 || height > 100) {
                System.out.println("The width and height should be between 10 and 100");
                System.out.print("Please enter the width and the height of the given rectangle: ");
                width = in.nextInt();
                height = in.nextInt();
            }
            givenRectangle = new Rectangle(0, 0, width, height);
            System.out.println(givenRectangle);

            //exit the program if the input not valid
        } else {
            System.out.println("Error: not integer value...Exit");
            System.exit(0);
        }


        System.out.print("Please enter how many rectangles you would like to generate: ");
        int numOfRectangles = in.nextInt();
        while (numOfRectangles <= 0) {
            System.out.print("Error: Enter integer value > 0...Try Again");
            System.out.print("Please enter how many rectangles you would like to generate: ");
            numOfRectangles = in.nextInt();
        }


        //printing the header of the program
        String star="*";
        System.out.println(star.repeat(68));
        System.out.printf("* Rect#  *   R(%6s%6s%6s%6s )   *   contained corners  *\n", "x,","y,","w,","h");
        System.out.println(star.repeat(68));

        //initialize some variables before using it in the loop
        int leftCorner = 0;
        int rightCorner = 0;
        int ranWidth = 0;
        int ranHeight = 0;
        int containedCorners=0;
        int overLap = 0;
        int counter = 1;


        // repeat the process until the condition is false
        while (numOfRectangles >= 1) {
            //create the random rectangles
            leftCorner = random.nextInt(-100, 101);
            rightCorner = random.nextInt(-100, 101);
            ranWidth = random.nextInt(30, 51);
            ranHeight = random.nextInt(30, 51);
            Rectangle ranRectangle = new Rectangle(leftCorner, rightCorner, ranWidth, ranHeight);


            //declare points
            Point point1= new Point(leftCorner,rightCorner);
            Point point2= new Point(leftCorner,rightCorner+ranHeight);
            Point point3= new Point(leftCorner+ranWidth,rightCorner+ranHeight);
            Point point4= new Point(leftCorner+ranWidth,rightCorner);

            //check contained corners
            if (givenRectangle.contains(point1)) {
                containedCorners++;
            }
            if (givenRectangle.contains(point2)) {
                containedCorners++;
            }
            if (givenRectangle.contains(point3)) {
                containedCorners++;
            }
            if (givenRectangle.contains(point4)) {
                containedCorners++;
            }


            //printing formatted output
            System.out.printf("*  %d", counter);
            System.out.printf("     *    (%5d,%5d,%5d,%6d )   * %9d            *\n"
                    ,leftCorner , rightCorner,ranWidth,ranHeight,containedCorners);

                containedCorners=0;
                counter++;


            //check if there is overlap
            if (!(ranRectangle.intersects(givenRectangle))) {
                overLap++;

            }

            //in order to stop the loop
            numOfRectangles = numOfRectangles - 1;

        }

        // the overlap
        System.out.println(star.repeat(68));
        System.out.println("Number of no-overlap with the given rectangle: " + overLap);

    }

}