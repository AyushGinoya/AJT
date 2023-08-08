/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package builderpattern;

/**
 *
 * @author ginoy
 */
public class BuilderPattern {
     public static void main(String[] args) {
        Builder b = new Builder();
        b.setTraderyo1("Monil");
        b.setHackeryo("Priyansh");
        b.setFlutteryo("Ayush");
        
        Friends dduFriends = b.create();
         System.out.println(dduFriends);
    }
}
