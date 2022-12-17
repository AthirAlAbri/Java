public class Moth {
    private double position;
    //private int lightPosition;

    public Moth(double givenPosition){
        this.position= givenPosition;

    }
    public void moveToLight(double lightPosition){
        this.position = 0.5 * (this.position + lightPosition);

    }
    public double getPosition(){

        return this.position;
    }
}
