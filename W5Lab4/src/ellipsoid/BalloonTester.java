/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ellipsoid;

/**
 *
 * @author Hp
 */
public class BalloonTester {
    public static void main (String[] args){
        Balloon b = new     Balloon(10,10,10,30000);
        System.out.println("After creating ");
        System.out.println(b.getVolume());
        System.out.println("After inflating by 10 ");
        System.out.println(b.getVolume());
        
    }
    
}
