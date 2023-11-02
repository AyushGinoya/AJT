/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decoratorpattern;

/**
 *
 * @author ginoya
 */
public class MainClass {

    public static void main(String[] args) {
        Shape mixColor = new BlueDecorator(new RedDecorator(new Ractangle()));
        mixColor.draw();
        
        System.out.println();
        
        Shape redCircle = new RedDecorator(new Circle());
        redCircle.draw();
    }
}
