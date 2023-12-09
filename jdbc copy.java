import java.sql.*;

public class jdbc {
    public static void main(String args[]) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/arpan", "root", "wolf@3306");

        System.out.println("Connection established");

        Statement st = con.createStatement();
        int i = st.executeUpdate("insert into tt values('Arpan',21,21)");
        System.out.println(i);
        ResultSet rs = st.executeQuery("select * from tt");
        rs.next();
        while(rs.next()){
            System.out.println(rs.getString(1)+" "+rs.getInt(2)+" "+rs.getInt(3)+"\n");
        }

    }
}