
public class Bug {
    /**
     * the position of the bug
     */
    private int position;
    private boolean left;

    /**
     * To create a bug moving along horizontal line
     * @param givenPosition
     */
    public Bug(int givenPosition){
        this.position = givenPosition;
        left = false;
    }

    /**
     * To change the direction of the bug
     */

    public void turn(){
        left= !left;
    }

    /**
     * To move the position be one unit
     */

    public void move(){
        if (!left) {
            this.position ++;
        }else{
            this.position --;
        }
    }

    /**
     * To get the current position of the bug
     * @return position
     */
    public int getPosition(){

        return this.position;
    }
}
//In order to make the bug immobile after 10 moves we should initilize a private variable for example int i = 0.
// and make an if statement in the method move() and make a loop the moves the bug one step at the time when i is
// less than 10 and appdate the loop variable which is i to stop the loop after it equals 10

