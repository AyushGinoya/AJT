/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package defaultmethodwithmultipleinheritance;

/**
 *
 * @author ginoy
 */
public class Car implements Fourwheeler, vehicle {
    @Override
    public void show()
    {
        vehicle.super.show();
        Fourwheeler.super.show();
        vehicle.tapHorn();
        
        System.out.println("I am car, Drive me");
    }
}
