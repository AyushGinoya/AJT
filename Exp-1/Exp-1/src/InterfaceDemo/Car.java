package InterfaceDemo;

public class Car implements Engine,Break,Media{
    int a=9;
    @Override
    public void deAcc() {
        System.out.println("I deaccelerate a normal car");
    }

    @Override
    public void start() {
        System.out.println("I start a normal car");
    }

    @Override
    public void stop() {
        System.out.println("I stop a normal car");
    }

    @Override
    public void acc() {
        System.out.println("I accelerate a normal car");
    }
}
