package factorypattern;

public class EmployeeFactory {
    public static Employee getEmployee(String type){
        if(type.equals("AppDevelopment")){
            return new AppDeveloper();
        } else if (type.equals("WebDeveloper")) {
            return new WebDeveloper();
        } else {
            return null;
        }
    }
}
