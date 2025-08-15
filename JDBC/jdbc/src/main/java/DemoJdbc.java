import java.sql.*;
public class DemoJdbc {
    public static void main(String[] args) throws Exception {
      Class.forName("org.postgresql.Driver");
       
        String dbUrl = "jdbc:postgresql://localhost:5432/jdbcdemo";
        String userName = "ravijha";
        String password = "R4ge@vr1";

        // String createQuery = "CREATE TABLE students (" +
        //              "id SERIAL PRIMARY KEY, " +
        //              "name TEXT NOT NULL, " +
        //              "age INT" +
        //              ")";

        // String insertQuery = "INSERT INTO students (name, age) VALUES ('Ravi Jha', 25)";

        String name = "Skinny pete";
        int age = 34;
        String insertQuery = "INSERT INTO students (name, age) VALUES (?, ?)";    // variable replacement way (to prevent sql injection, making simple to write query). Only works with prepared statement

        
        String fetchQuery = "SELECT * from students";

        Connection con = DriverManager.getConnection(dbUrl, userName, password);
        Statement stmt = con.createStatement();
        PreparedStatement pstmt = con.prepareStatement(insertQuery);
        pstmt.setString(1, name);
        pstmt.setInt(2, age);
        pstmt.execute();

        // stmt.executeUpdate(insertQuery);
        // ResultSet results =  stmt.executeQuery(fetchQuery);
        // results.next();     // pointer points to previuos loaction (eg:- if we have data at 0th index the pointer initially would be at -1, that's why next())
        // String sName = results.getString("name");
        // System.err.println(sName);

        // while(results.next()){
        //   System.out.print(results.getString("name") + "" + results.getInt(3));
        // }
      
        pstmt.close();
        con.close();




    }
}
