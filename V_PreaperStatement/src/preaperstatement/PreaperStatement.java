/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package preaperstatement;

import java.awt.Button;
import java.sql.*;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ginoy
 */
public class PreaperStatement extends Frame implements ActionListener {

    Button insert, delete, update, display;
    TextField t1, t2;
    Label l1, l2;

    public PreaperStatement() {
        setLayout(new FlowLayout());
        setSize(700, 600);
        setVisible(true);

        insert = new Button("Insert");
        delete = new Button("Delete");
        update = new Button("Update");
        display = new Button("Display");

        t1 = new TextField(20);
        t2 = new TextField(20);

        l1 = new Label("name");
        l2 = new Label("Id");

        add(l2);
        add(t1);
        add(l1);
        add(t2);
        add(insert);
        add(delete);
        add(update);
        add(display);

        insert.addActionListener(this);
        delete.addActionListener(this);
        update.addActionListener(this);
        display.addActionListener(this);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {

                super.windowClosing(e); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
                dispose();
            }
        });

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        try {

            String id = t1.getText().toString();
            String name = t2.getText().toString();

            String url = "jdbc:mysql://localhost:3306/collage";
            String username = "root";
            String password = "Ayush@#2000";

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection(url, username, password);
                System.out.println("Connection Established successfully");

                if (e.getSource() == insert) {
                    String q = "INSERT INTO pst VALUES (?, ?)";
                    PreparedStatement pst = con.prepareStatement(q);
                    pst.setString(1, id);
                    pst.setString(2, name);
                    pst.executeUpdate();
                }

                if (e.getSource() == update) {
                    String q = "update pst set name = ? where id = ?";
                    PreparedStatement pst = con.prepareStatement(q);
                   pst.setString(2, id);
                    pst.setString(1, name);
                    pst.executeUpdate();
                }

                if (e.getSource() == delete) {
                    String q = "Delete from pst where name=? and id=?";
                    PreparedStatement pst = con.prepareStatement(q);
                   pst.setString(2, id);
                    pst.setString(1, name);
                    pst.executeUpdate();
                }
                
                if(e.getSource()==display){
                    String q = "Select * from pst";
                    PreparedStatement ptm = con.prepareStatement(q);
                    ResultSet rs = ptm.executeQuery();
                    
                    while(rs.next()){
                        System.out.println("Name="+rs.getString("name")+"   "+"Id="+rs.getString("id"));
                    }
                }

                con.close();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(PreaperStatement.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PreaperStatement.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void main(String[] args) {
        // TODO code application logic here
        PreaperStatement p = new PreaperStatement();
    }

}
