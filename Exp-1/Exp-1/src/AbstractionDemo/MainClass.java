package AbstractionDemo;

public class MainClass {
    public static void main(String[] args) {
        Son s = new Son();
        s.career();

        //You can not create Abstract Class Object and abstract Constractor

        Daughter d = new Daughter();
        d.career();
    }
}
