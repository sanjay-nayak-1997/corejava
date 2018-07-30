import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeletePreparedStatement {

	public static void main(String[] args) {

		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);

			Class.forName("oracle.jdbc.driver.OracleDriver");

			Connection con = null;

			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String usr = "scott";
			String pwd = "tiger";

			con = DriverManager.getConnection(url, usr, pwd);

			int deptno;

			System.out.println("Enter the deptno of record which you need to delete : ");
			deptno = Integer.parseInt(br.readLine());

			String sql = "DELETE FROM DEPT WHERE DEPTNO = ?";
			PreparedStatement stmt = con.prepareStatement(sql);

			stmt.setInt(1, deptno);
			int num = stmt.executeUpdate();

			if (num > 0) {
				System.out.println("Record has been deleted successfully !");
			} else {
				System.out.println("Error ! Record has not been deleted !");
			}

		} catch (SQLException e) {
			System.out.println("SQL EXCEPTION OCCURED  : " + e.getMessage());
		} catch (IOException e) {
			System.out.println("IO EXCEPTION OCCURED   : " + e.getMessage());
		} catch (ClassNotFoundException e) {
			System.out.println("EXCEPTION              : " + e.getMessage());
		}

	}
}
