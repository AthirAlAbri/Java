import java.util.Scanner;
public class Lab2_Ex3 {
    public static void main(String[] agrs){
        Scanner in = new Scanner(System.in);


        int num =-1;
        int sum = 0;
        int digit = 0;

        while (num<=0 || num>99999) {
            System.out.print("Enter a positive integer: ");
            if (in.hasNextInt()){
                num = in.nextInt();
            }else {
                System.out.println("Error: not integer value...Exit");
                System.exit(0);
            }

        }

       while (num>0 && num<=99999){
           digit= num%10;
           sum= sum+digit;
           num= num/10;


       }


        System.out.println("Sum of Digits: "+ sum);




    }


}
