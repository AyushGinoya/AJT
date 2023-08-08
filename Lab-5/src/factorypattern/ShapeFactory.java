/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorypattern;

/**
 *
 * @author ginoy
 */
public class ShapeFactory {
    
    static Square create(){
        return new Square();
    }
    
    static Circle create1(){
        return new Circle();
    }
    
    static Triangle create2(){
        return new Triangle();
    }
    
}
