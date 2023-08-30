package factorypattern;

public class WebDeveloper implements Employee{
    @Override
    public int Salary() {
        System.out.println("Web Developer");
        return 600000;
    }
}
