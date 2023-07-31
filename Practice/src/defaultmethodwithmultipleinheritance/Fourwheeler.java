/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package defaultmethodwithmultipleinheritance;

/**
 *
 * @author ginoy
 */
public interface Fourwheeler {
    default void show()
    {
        System.out.println("I am FourWheeler, Drive me");
    }
}
