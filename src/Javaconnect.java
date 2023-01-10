
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Javaconnect {
    Connection conn;
    
    public static Connection connecrDb(){
        try{
         Class.forName("org.sqlite.JDBC")   ;
         Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\CSE\\Documents\\Courier Service Management System\\courier.sqlite");
         return conn;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
    
}
