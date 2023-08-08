/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorypattern;

/**
 *
 * @author ginoy
 */
public class MainClass {
    public static void main(String[] args) {
        Shape cir = ShapeFactory.create1();
        cir.draw();
        
        Shape squ = ShapeFactory.create();
        squ.draw();
        
        Shape tri = ShapeFactory.create2();
        tri.draw();
    }
}
