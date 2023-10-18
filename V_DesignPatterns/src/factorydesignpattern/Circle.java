package factorydesignpattern;

/**
 *
 * @author ginoya
 */
public class Circle implements Shape {

    private int red;

    public Circle(int red) {
        System.out.println("Circle Constractor called");
        this.red = red;
    }

    @Override
    public String toString() {
        return "Circle{" + "red=" + red + '}';
    }

    @Override
    public void area() {
        System.out.println(3.14 * red * red);
    }

    @Override
    public void draw() {
        System.out.println("Circle Draw");
    }

    @Override
    public void fillColor() {
        System.out.println("Red Color");
    }

}
