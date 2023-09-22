package jdbcconnectivity;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class demo {
    public static void main(String[] args) throws SQLException {

        String sql = "select * from coursw ";
        String url = "jdbc:MySql://localhost:3306/collage";
        String username = "MySql"; 
        String password = "123";



        Connection con =  DriverManager.getConnection(url, username, password);

        Statement st = (Statement) con.createStatement();

       ResultSet rs =  st.execute();
       rs.next();

        String name =  rs.getString(1);
        System.out.println(name);
        con.close();
        
    }
}
