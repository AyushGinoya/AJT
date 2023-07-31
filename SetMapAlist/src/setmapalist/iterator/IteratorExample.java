/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package setmapalist.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author ginoy
 */

class Student{
    private int id;
    private String name;
    
    Student(int id,String name){
        this.id = id;
        this.name = name;
    }
    
    public int getStudentId() {
        return id;
    }
    
    public String getStudentName() {
        return name;
    }
    
    public void setStudentId(int sid){
        this.id = id;
    }
    
    public void setStudentName(int sname){
        this.name = name;
    }
}
public class IteratorExample {
    
    public static void main(String[] args){
        List<Student> list = new ArrayList<>();
        list.add(new Student(1, "Ayush"));
        list.add(new Student(2, "Deep"));
        list.add(new Student(3, "Raj"));
        list.add(new Student(4, "Vansh"));
        list.add(new Student(5, "Sahil"));
        
        Iterator<Student> it = list.iterator();
        
        Student stu;
        
        while(it.hasNext()) {
            stu=it.next();
            System.out.println("id="+stu.getStudentId()+"   Name="+stu.getStudentName());
        }
    }
}
