package InterfaceDemo;

public class MusicPlayer implements Media{
    @Override
    public void stop() {
        System.out.println("I stop media");
    }

    @Override
    public void start() {
        System.out.println("I start media");
    }
}
