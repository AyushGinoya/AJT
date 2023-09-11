package exp.pkg5;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Exp5 {

    public static void main(String[] args) {

        Connection con = null;
        PreparedStatement insertStatement = null;

        try {
            con = DBConnection.getConnection();
            con.setAutoCommit(false);

            String insertSQL = "INSERT INTO studentexp5 (id, name, age) VALUES (?, ?, ?)";

            insertStatement = con.prepareStatement(insertSQL);

            String[][] dataToInsert = {
                {"21ITUES058", "Ayush", "20"},
                {"21ITUES059", "Ayushi", "21"},
                {"21ITUES050", "Priyanka", "22"},
                {"21ITUES057", "Shahil", "15"}
            };

            for (String[] rowData : dataToInsert) {
                insertStatement.setString(1, rowData[0]);
                insertStatement.setString(2, rowData[1]);
                insertStatement.setInt(3, Integer.parseInt(rowData[2]));
                insertStatement.addBatch();
            }

            insertStatement.executeBatch();
            int maxAge = getMaxAgeFromDatabase(con);

            int age = 45;
            if (Condition(age, maxAge)) {
                con.rollback();
                System.out.println("Transaction rolled back b'coz of age");
            } else {
                con.commit();
                System.out.println("Transaction committed successfully.");
            }
        } catch (SQLException ex) {
            if (con != null) {
                try {
                    con.rollback();
                } catch (SQLException e) {
                    Logger.getLogger(Exp5.class.getName()).log(Level.SEVERE, null, e);
                }
                System.out.println("Transaction rolled back due to an exception.");
            }
        }
    }

    private static int getMaxAgeFromDatabase(Connection con) throws SQLException {
        String maxAgeSQL = "SELECT MAX(age) FROM studentexp5";
        try (PreparedStatement maxAgeStatement = con.prepareStatement(maxAgeSQL);
             ResultSet resultSet = maxAgeStatement.executeQuery()) {
            if (resultSet.next()) {
                return resultSet.getInt(1);
            }
        }
        return 0;
    }

    private static boolean Condition(int age, int maxAge) {
        return maxAge > age;
    }
}
