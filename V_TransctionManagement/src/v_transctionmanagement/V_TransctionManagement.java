package v_transctionmanagement;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class V_TransctionManagement extends Frame implements ActionListener {

    Button b1, b2;
    TextField t1, t2, t3;
    Label l1, l2, l3;

    V_TransctionManagement() {
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(500, 500);
        b1 = new Button("Display");

        t1 = new TextField(20);
        t2 = new TextField(20);
        t3 = new TextField(20);

        l1 = new Label("C_Account Number");
        l2 = new Label("Transfer Amount");
        l3 = new Label("D_Account Number");

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(b1);
        b1.addActionListener(this);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                dispose();
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String url = "jdbc:mysql://localhost:3306/collage";
        String uname = "root";
        String pass = "Ayush@#2000";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, uname, pass);
            con.setAutoCommit(false);

            int amount = Integer.parseInt(t2.getText());
            int c_account = Integer.parseInt(t1.getText());
            int d_account = Integer.parseInt(t3.getText());

            if (isAvailable(con, amount, c_account) && isAvailable(con, amount, d_account)) {
                String cradit = "update transctionmanagement set balance = balance - ? where account_no = ?";
                String debit = "update transctionmanagement set balance = balance + ? where account_no = ?";

                PreparedStatement c_st = con.prepareStatement(cradit);
                PreparedStatement d_st = con.prepareStatement(debit);

                c_st.setInt(1, amount);
                c_st.setInt(2, c_account);

                d_st.setInt(1, amount);
                d_st.setInt(2, d_account);

                c_st.executeUpdate();
                d_st.executeUpdate();

                con.commit();
                System.out.println("Transaction Successful!");
            } else {
                System.out.println("Insufficient Balance for one of the accounts!");
                con.rollback();
            }

            con.close();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(V_TransctionManagement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    boolean isAvailable(Connection con, int amt, int acc) {
        boolean isAvailable = false;
        String checkBalanceQuery = "SELECT balance FROM transctionmanagement WHERE account_no = ?";

        try (PreparedStatement checkBalanceStmt = con.prepareStatement(checkBalanceQuery)) {
            checkBalanceStmt.setInt(1, acc);
            ResultSet rs = checkBalanceStmt.executeQuery();

            if (rs.next()) {
                int balance = rs.getInt("balance");
                if (balance >= amt) {
                    isAvailable = true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(V_TransctionManagement.class.getName()).log(Level.SEVERE, null, ex);
        }

        return isAvailable;
    }

    public static void main(String[] args) {
        V_TransctionManagement t = new V_TransctionManagement();
    }
}
