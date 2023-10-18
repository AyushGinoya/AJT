package factorydesignpattern;

/**
 *
 * @author ginoya
 */
public class Ractangle implements Shape {

    private int wid;
    private int hit;

    @Override
    public String toString() {
        return "Ractangle{" + "wid=" + wid + ", hit=" + hit + '}';
    }

    public Ractangle(int wid, int hit) {
        System.out.println("Ractangle Constractor called");
        this.wid = wid;
        this.hit = hit;
    }

    @Override
    public void area() {
        System.out.println(wid * hit);
    }

    @Override
    public void draw() {
        System.out.println("Ractangle Draw");
    }

    @Override
    public void fillColor() {
        System.out.println("Blue Color");
    }

}
