import java.io.*;
import java.sql.*;

public class jdbc {
    public static void main(String[] args)throws Exception{

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost//3306/arpan", "root","wolf@3306");

        System.out.println("Connection established");

        // Statement st = con.createStatement();
        // int i = st.executeUpdate("create table tt(name verchar(10),roll int(5),age int(2))");

        // System.out.print(i);

    }
}
