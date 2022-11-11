package myPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author Clover Enryms
 */


public class connection {
    public static Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlicuahang", "root","root");
            return con;
        } catch (Exception e) {
            Logger.getLogger(loginForm.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null,"Not Connected \n\n"+e+"\n\n");
            return null;
         }   
    }
}
