package comboLockTester;
import comboLock.ComboLock; //import the package

public class ComboLockTester {
    public static void main(String[] args) {
        ComboLock Lock = new ComboLock(25, 36, 19);
        Lock.reset();
        Lock.turnRight(25);
        Lock.turnLeft(11);
        Lock.turnRight(22);
        //print output
        //expected result: false (lock is closed)
        System.out.println("The state of the lock is " + Lock.getStatus());


        //second lock
        ComboLock Lock2 = new ComboLock(36, 24, 36);
        Lock2.reset();
        Lock2.turnRight(36);
        Lock2.turnLeft(12);
        Lock2.turnRight(12);
        //print output
        //expected result: true (lock is opened)
        System.out.println("The state of the lock is " + Lock2.getStatus());

    }
}
