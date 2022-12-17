/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ellipsoid;

/**
 *Ellipsoid balloon
 * @author Hp
 */
public class Balloon {
    
    private double radius_a;
    private double radius_b;
    private double radius_c;
    private double limit;
    private boolean exploded;
    /**
     * create a balloon having radiuses equal to 0,0,10
     * and a limited volume equal to limit
     * @param limit 
     */
    public Balloon(double limit){
        this.radius_a = 0;
        this.radius_b = 0;
        this.radius_c = 10;
        this.limit = limit;
        
        this.exploded= false;
    }
    /**
     * create a balloon having radiuses equal to a, b, c
     * @param a
     * @param b
     * @param c
     * @param limit 
     */
    
    public Balloon(double a,double b,double c,double limit){
        this.radius_a = a;
        this.radius_b = b;
        this.radius_c = c;
        this.limit = limit;
        
        this.exploded= false;
        
    }
    
    public void inflate(double amount){
        if (! this.exploded){
            this.radius_a += amount /2;
            this.radius_b += amount; 
            this.radius_c += amount /2;
        }
        if (getVolume()>= limit){
            this.exploded= true;
            this.radius_a = 0;
            this.radius_b = 0;
            this.radius_c = 0; 
        }
        
    }
    
    public double getVolume(){
        double volume = 4.0/3 * Math.PI * this.radius_a * this.radius_b * this.radius_c ;
        return volume;
        
    }
}
