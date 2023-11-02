/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q2a;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


/**
 *
 * @author ginoya
 */
public class MainClass {

    public static void main(String[] args) {
        try {
            String URL = "jdbc:mysql://localhost:3306/collage?zeroDateTimeBehavior=CONVERT_TO_NULL";
            String USERNAME = "root";
            String PASSWORD = "Ayush@#2000";
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = (Connection) DriverManager.getConnection(URL, USERNAME, PASSWORD);

            int[] cid = {1, 2, 3};
            String[] name = {"Eco-sport", "Venue", "Nexon"};
            long[] price = {500000, 700000, 800000};

            String q = "INSERT INTO car VALUES (?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(q);

            for (int i = 0; i < 3; i++) {
                pst.setInt(1, cid[i]);
                pst.setString(2, name[i]);
                pst.setLong(3, price[i]);
                pst.addBatch();
            }

            pst.executeBatch();

            pst.close();
            con.close();

            System.out.println("Batch Insertion Successful!");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
