/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.demo.servlet;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author ginoy
 */
public class Jdbc {
        final static String  url="jdbc:mysql://localhost:3306/collage?zeroDateTimeBehavior=CONVERT_TO_NULL";
         final static String name="root";
         final static String pass="Ayush@#2000";
        
        public static Connection getConnection(){
            Connection c=null;
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                c = DriverManager.getConnection(url, name, pass);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Jdbc.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Jdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
            return c;
        }
}
