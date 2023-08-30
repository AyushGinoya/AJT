package Composition;

public class Student {
    String name;
    String id;

    StudentAddress sa;   //aggregation

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
        sa = new StudentAddress("Jamnagar",345654);  //association
    }

    void showStudent(){
        System.out.println("Student : " + name + "  " + id);
        System.out.println(sa.city + "  "+sa.pin);
    }

    public static void main(String[] args) {
        Student s = new Student("Ayush","21ITUESO58");
        s.showStudent();
    }
}
