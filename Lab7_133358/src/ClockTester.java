public class ClockTester {
    public static void main(String [] args){
        //super class
        Clock clock = new Clock();
        System.out.println("Time in California: " + clock.getTime() );

        //sub class
        WorldClock clock2 = new WorldClock(3);
        System.out.println("Time in NewYork: " + clock2.getTime() );
    }
}
