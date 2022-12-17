
import java.util.Scanner;
public class rectangle {

    public static void main (String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("enter the height: ");
        double height = in.nextDouble();
        System.out.print("enter the width: ");
        double width = in.nextDouble();
        double area = height*width;
        double diagonal = Math.sqrt(Math.pow(height,2)+ Math.pow(width,2));
        System.out.println("The area ot the rectangle= " + area);
        System.out.print("The length of diagonal= " + diagonal);

    }
}
