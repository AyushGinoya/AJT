/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decoratorpattern;

/**
 *
 * @author ginoy
 */
public class BlueDecorator extends ShapeDecorator {

    public BlueDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        shape.draw();
        setBoader();
    }

    private void setBoader() {
        System.out.println("Boder Color : Blue");
    }

}
