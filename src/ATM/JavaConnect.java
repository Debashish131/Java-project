/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ATM;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Dev
 */
public class JavaConnect {
    Connection conn;
    public static Connection ConncerDB(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn=DriverManager.getConnection("jdbc.sqlite:C:\\Users\\HP\\Desktop\\Programming\\Netbeans\\ATM BOOTH FINAL\\src\\ATM.sqlite");
            return conn;
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
        
    }
}

