/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spherical;

/**
 *
 * @author Hp
 */
public class BalloonTester {
    public static void main(String[]args){
    
    Balloon b = new Balloon();
    System.out.printf("Volume=%.f\n", b.getVolume());
    
    b.inflate(10);
 System.out.printf("Volume=%.f\n", b.getVolume());
    
    }
}
