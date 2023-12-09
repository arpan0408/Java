import java.sql.*;

public class jdbc_execute {
    public static void main(String[]args) throws ClassNotFoundException,SQLException
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/arpan","root","wolf@3306");
        System.out.println("Connection established");


        Statement st = con.createStatement();
        Boolean in = st.execute("insert into tt values('Garvit',41,20),('Santosh',20,80),('Ayush',29,19)");
        System.out.println(in);
        Boolean b = st.execute("select * from tt");
        System.out.println(b);
        ResultSet rs = null;
        if(b)
        rs = st.getResultSet();

        rs.next();
        while(rs.next())
        {
            System.out.println(rs.getString(1)+" "+rs.getInt(2)+" "+rs.getInt(3)+"\n");
        }


        
    }
    
}
