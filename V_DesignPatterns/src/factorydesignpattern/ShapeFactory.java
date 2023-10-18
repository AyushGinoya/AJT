package factorydesignpattern;

/**
 *
 * @author ginoya
 */
public class ShapeFactory {
    public static Shape getShape(String type){
        if(type.equals("Circle")){
            return new Circle(10);
        }else if(type.equals("Ractangle")){
            return new Ractangle(10, 10);
        }
        
        return null;
    }
}
