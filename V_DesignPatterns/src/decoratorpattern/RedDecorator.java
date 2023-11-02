/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decoratorpattern;

/**
 *
 * @author ginoya
 */
public class RedDecorator extends ShapeDecorator {
    
    public RedDecorator(Shape shape) {
        super(shape);
    }
    
    @Override
    public void draw(){
        shape.draw();
        setBoader(shape);
    }

    private void setBoader(Shape shape) {
        System.out.println("Boder Color : Red");
    }
    
}
