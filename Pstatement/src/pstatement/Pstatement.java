/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pstatement;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql.*;
import java.util.*;

/**
 *
 * @author ginoya
 */
public class Pstatement extends Frame implements ActionListener{
    
    Button insert,delete,update;
    Label l1,l2;
    TextField t1,t2;
    Connection con=null;
    
    Pstatement()
    {
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(500,500);
        insert = new Button("Insert");
        delete = new Button("Delete");
        update = new Button("Update");
        
        
        t1=new TextField(20);
        t2=new TextField(20);
        
        l1 = new Label("Name");
        l2 = new Label("Id");
        
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(insert);
        add(delete);
        add(update);
        update.addActionListener(this);
        delete.addActionListener(this);
        insert.addActionListener(this);
        addWindowListener (new WindowAdapter() {    
            @Override
            public void windowClosing (WindowEvent e) {        
                dispose();    
            }    
        });    
        
    }
     public void actionPerformed(ActionEvent e){
            String name = t1.getText().toString();
            String id = t2.getText().toString();
            
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            con =DriverManager.getConnection("jdbc:mysql://localhost:3306/collage?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "Ayush@#2000");
            System.out.print("OK");
            if (e.getSource() == insert) {
                String query = "INSERT INTO student (namw, id) VALUES (?, ?)";
                PreparedStatement pst = con.prepareStatement(query);
                pst.setString(1, name);
                pst.setString(2, id);
                int rowsInserted = pst.executeUpdate();
                System.out.println(" "+ rowsInserted + " row(s) Inserted.");
            } else if (e.getSource() == delete) {
                 PreparedStatement pst = con.prepareStatement("DELETE FROM student WHERE namw = ? AND id = ?");
                 pst.setString(1,name);
                 pst.setString(2,id);
                 int rowsDeleted = pst.executeUpdate();
                 System.out.println(" "+rowsDeleted + " row(s) deleted.");
            } else if (e.getSource() == update) {
                String updateQuery = "UPDATE student SET namw = ? WHERE id = ?";
                PreparedStatement pst = con.prepareStatement(updateQuery);
                pst.setString(1, name);
                pst.setString(2, id);
                int rowsUpdated = pst.executeUpdate();
                System.out.println(" "+rowsUpdated + " row(s) updated.");
            }

            con.close();
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        }catch (SQLException ex) {
            System.out.println(ex);
        }  
        }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pstatement ps = new Pstatement();   
    }
    
}
