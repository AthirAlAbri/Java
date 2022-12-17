
package spherical;

/**
 * A spherical balloon
 * @author Hp
 */
public class Balloon {
    /**
     * The radius of spherical balloon
     */
    private double radius;
    /**
     * Create the balloon having a radius equals 10
     */
    public Balloon(){
        this.radius = 10;
        
    }
    /**
     * To increase the radius by a given amount
     * @param amount the increasing value
     */
    public void inflate(double amount){
        this.radius += amount;
        
    }
    /**
     * To get the current volume of the balloon
     * @return volume
     */
    public double getVolume(){
        double volume = 4.0/3 * Math.PI * Math.pow(this.radius, 3);
        return volume;
    }
    
}
