package comboLock;

public class ComboLock {
    private int num1;
    private int num2;
    private int num3;
    private int current;
    private int status;

    /**
     * Creat a comboo lock that works like the combination lock in a gym locker. The
     * lock is constructed with a combination—three numbers between 0 and 39.
     *
     * @param first
     * @param second
     * @param third
     */

    public ComboLock(int first, int second, int third) {
        this.num1 = first;
        this.num2 = second;
        this.num3 = third;
        this.current = 0;
        this.status = 0;

    }


    /**
     * To resets the dial so that it points to 0.
     */
    public void reset() {
        current = 0;
        status = 0;
    }


    /**
     * To s turn the dial by a given number of ticks to the right.
     *
     * @param ticks
     */
    public void turnRight(int ticks) {
        this.current += ticks;

        if (this.current > 39) {
            this.current = this.current - 39;
        }

        if (this.status == 0 && this.current == this.num1) {
            this.status = 1;
        } else if (this.status == 2 && this.current == this.num3) {
            status = 3;
        } else {
            this.status = 0;
        }

    }


    /**
     * To s turn the dial by a given number of ticks to the left.
     *
     * @param ticks
     */
    public void turnLeft(int ticks) {
        this.current -= ticks;

        if (this.current < 0) {
            this.current = 39 - this.current;
        }

        else if (this.status == 1 && this.current == this.num2) {
            this.status = 2;
        } else {
            this.status = 0;
        }
    }

    /**
     * To returns a Boolean indicating whether the lock is opened(true) or closed(false).
     *
     * @return true
     * @return false
     */
    public boolean getStatus() {
        if (this.status == 3) { //the lock open
            this.status = this.status + 1 ;
            return true;
        } else {
            this.status = 0; //the lock not open
            return false;
        }


    }
}
