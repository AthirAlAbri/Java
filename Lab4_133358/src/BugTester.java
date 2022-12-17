import java.sql.SQLOutput;

public class BugTester {
    public static void main(String[]args){
        Bug bug = new Bug(10);

        System.out.println("The expected position: 10, " +
                "The actual position: "+ bug.getPosition() );

        bug.move();
        bug.move();
        bug.move();
        System.out.println("The expected position: 13, " +
                "The actual position: "+ bug.getPosition() );

        bug.turn();
        bug.move();
        bug.move();
        System.out.println("The expected position: 11, " +
                "The actual position: "+ bug.getPosition() );

    }
}
