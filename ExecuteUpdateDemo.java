import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.*;
import java.io.*;

public class ExecuteUpdateDemo {

	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {

			System.out.println("Driver does not exists");

		}
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String usr = "scott";
		String pwd = "tiger";
		Connection con = null;

		try {
			con = DriverManager.getConnection(url, usr, pwd);

			int deptno;
			String dname;
			String loc;

			System.out.println("Enter the department number : ");
			deptno = Integer.parseInt(br.readLine());

			System.out.println("Enter the department name   : ");
			dname = br.readLine();

			System.out.println("Enter the location          : ");
			loc = br.readLine();

			String qry = "INSERT INTO DEPT VALUES(?,?,?)";

			PreparedStatement stmt = con.prepareStatement(qry);
			stmt.setInt(1, deptno);
			stmt.setString(2, dname);
			stmt.setString(3, loc);
			int num = stmt.executeUpdate();
			if (num > 0) {
				System.out.println("Record has been inserted successfully !");
			} else {
				System.out.println("Error! Record was not inserted !");
			}
		} catch (SQLException e) {
			System.out.println("Error-" + e.getMessage());
		}

	}

}
