
package bank.management.systems;

import java.sql.*;

public class Conn {
    
    Connection c;
    Statement s;
    public Conn(){
        try {
            
            c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem", "root", "legend");
            s = c.createStatement();
            
            
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
}
