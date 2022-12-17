import java.util.Arrays;
import java.util.Random;


public class TemperatureTester {

    public static void main(String[] args) {
        Random random = new Random();
        double[][] temp = new double[4][30];

        for (int i = 0; i < 4; i++) {
            temp[i][0] = 1 + i;
            for (int j = 0; j <= 30; j++) {
                temp[i][j] = random.nextInt(-100, 100);

            }
        }

        Temperatures temp1 = new Temperatures();
        temp1.temp=temp;
        System.out.println("The temperature at city code 2 and day 1 is: "+ temp1.getTemperature(1,2));
        System.out.println("The minimum temperature at city code 20 is: "+ temp1.getMinimumTemperature(20));
        System.out.println("The maximum temperature at city code 17 is: "+ temp1.getMinimumTemperature(17));
        System.out.println("The average temperature at city code 23 is: "+ temp1.getMinimumTemperature(23));




    }
}