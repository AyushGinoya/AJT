package factorypattern;

public class AppDeveloper implements Employee{
    @Override
    public int Salary() {
        System.out.println("App Developer");
        return 700000;
    }
}
