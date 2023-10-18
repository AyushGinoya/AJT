package factorydesignpattern;

/**
 *
 * @author ginoya
 */
public class MainClass {

    public static void main(String[] args) {
        Shape shape1 = ShapeFactory.getShape("Ractangle");
        shape1.area();
        shape1.draw();
        shape1.fillColor();
        Shape shape2 = ShapeFactory.getShape("Circle");
        shape2.area();
        shape2.draw();
        shape2.fillColor();

//        System.out.println(shape1);
//        System.out.println(shape2);
    }
}
