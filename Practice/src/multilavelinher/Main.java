/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multilavelinher;

/**
 *
 * @author ginoy
 */

// interface 1----> interface 2 ----> interface 3 -----> class Main
public class Main implements interface2 {
    public static void main(String[] args) {
        interface2Impl in = new interface2Impl();
        in.hello();
    }
}
