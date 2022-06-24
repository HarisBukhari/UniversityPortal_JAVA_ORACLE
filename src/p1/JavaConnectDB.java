package p1;

import dbconpack.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 * @author Zotac-PC
 **/
public class JavaConnectDB {
    
    public static Connection ConnectDB(){
       try{
           Class.forName("oracle.jdbc.OracleDriver");
           Connection conn;
           conn = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/orclpdb","hr","hr");
           return conn;
       } catch(ClassNotFoundException | SQLException e){
           JOptionPane.showMessageDialog(null, e);
       }
        return null;
    }
}

