package InterfaceDemo;

public class MainClass {
    public static void main(String[] args) {
//        Car c =new Car();
          Engine c =new Car();
//        //c.a  not possible B'coz
//
//        //You only access data of the Engine
//
//        c.start();
//        c.acc();
//        c.stop();

        Media md = new Car();
        md.stop();
        //It's Like you stop Media but car is stopped

        Media m = new MusicPlayer();
        m.stop();
        m.start();

        PowerEngine p =new PowerEngine();
        p.acc();
        p.acc();
        p.stop();
    }
}
