/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q2b;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author ginoya
 */
public class Main {

    public static void main(String[] args) {
        Set<Student> group1 = new HashSet<>();
        group1.add(new Student(1, "Ayush"));
        group1.add(new Student(2, "Ayushi"));

        Set<Student> group2 = new HashSet<>();
        group2.add(new Student(2, "Ayushi"));
        group2.add(new Student(3, "Rajvi"));

        Set<Student> uniqueMembersGroup1 = new HashSet<>(group1);
        uniqueMembersGroup1.removeAll(group2);

        Set<Student> uniqueMembersGroup2 = new HashSet<>(group2);
        uniqueMembersGroup2.removeAll(group1);

        System.out.println("Unique Members in Group 1:");
        displayMemberNames(uniqueMembersGroup1);

        System.out.println("Unique Members in Group 2:");
        displayMemberNames(uniqueMembersGroup2);
    }

    private static void displayMemberNames(Set<Student> members) {
        for (Student student : members) {
            System.out.println("Roll Number: " + student.getRollNumber() + ", Name: " + student.getName());
        }
    }
}
