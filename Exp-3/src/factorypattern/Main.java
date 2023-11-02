package factorypattern;

public class Main {
    public static void main(String[] args) {
        /*
         Employee employee = new AppDeveloper();
         It is a creational design pattern that talks about the creation of an object
        */

        Employee employee = EmployeeFactory.getEmployee("AppDevelopment");
        int s = employee.Salary();
        System.out.println(s);

        System.out.println();

        Employee employee1 = EmployeeFactory.getEmployee("WebDeveloper");
        int s1 = employee1.Salary();
        System.out.println(s1);

        /*
        focus on creating object of interface rather than implementation.
        focus on Employee not App or web Developer
        */
    }
}
