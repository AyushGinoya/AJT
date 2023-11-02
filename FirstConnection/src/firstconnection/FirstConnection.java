package firstconnection;

import java.sql.*;

public class FirstConnection {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=CONVERT_TO_NULL";
        String username = "root";
        String password = "Ayush@#2000";
        String query = "select * from mysql.students";
        
        try { 
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("Connection Established successfully");
            
            Statement st = con.createStatement();
            //int row1 = st.executeUpdate("insert into students values('Raj',110) ");
            //int row2 = st.executeUpdate("update students set name = 'Ram' where id= 110 " );
            //int row2 = st.executeUpdate("update students set name = 'Ram' where id = 110");
            ResultSet rs = st.executeQuery(query);
            

            while ( rs.next() ) {
                String name = rs.getString("name");
                String id = rs.getString("id");
                System.out.println(name + " " + id);
            }
            
            st.close();
            con.close();
            System.out.println("Connection Closed....");
        } catch (SQLException e) {
            System.out.println("Connection could not be established: "+ e);
        } catch (Exception ae) {
            System.out.println(ae);
            System.out.println("Unknown error occurred");
        }
    }
}