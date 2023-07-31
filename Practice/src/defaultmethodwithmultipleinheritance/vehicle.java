/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package defaultmethodwithmultipleinheritance;

/**
 *
 * @author ginoy
 */
public interface vehicle {
    default void show()
    {
        System.out.println("Hello i am vehicle, Drive me");
    }
    
    static void tapHorn()
    {
        System.out.println("piiiiiip piiiiip, piiiiiiip");
    }
    
}
