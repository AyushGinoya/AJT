/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package builderpattern;

/**
 *
 * @author ginoy
 */
public class MainCLass {
    public static void main(String[] args){
        User ayush = new User.UserBuilder().setEmail("ayushginoya23@gmail.com")
                                                                   .setId("21ITUES058")
                                                                   .setName("Ayush Ginoya")
                                                                   .build();
        System.out.println();
        System.out.println(ayush);
    }
}
