import java.sql.*;

public class JdbcConnect {

	public static void main(String[] args) {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e1) {
			
			System.out.println("Unable to locate the driver");
		}
		
		String URL="jdbc:oracle:thin:@localhost:1521:orcl";
		String user="scott";
		String pwd="tiger";
		
		try {
		Connection con=DriverManager.getConnection(URL,user,pwd);
		System.out.println("Connection is successful, now your program is connected");
		}
		catch(SQLException e)
		{
			System.out.println("Could not connect to the server, some problem");
		}
	}

}
