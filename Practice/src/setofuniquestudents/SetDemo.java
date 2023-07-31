/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package setofuniquestudents;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author ginoy
 */
public class SetDemo {
    public static void main(String[] args){
        Set<Student> set = new HashSet<>();
        
        set.add(new Student(1,"Ayush"));
        set.add(new Student(2,"Deep"));
        set.add(new Student(2,"Deep"));
        set.add(new Student(3,"Ayushi"));
        set.add(new Student(4,"Deep"));
        
        for(Student student : set){
            System.out.println("Student id : "+student.getId()+ " Name : "+student.getName());
        }
    }
    
}
