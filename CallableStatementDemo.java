import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

import org.w3c.dom.css.CSSStyleSheet;

public class CallableStatementDemo {

	public static void main(String[] args) {

		try
		{
		Class.forName("oracle.jdbc.driver.OracleDriver");

		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
		
		String sql="{?=call BIGGEST(?,?)}";
		
		CallableStatement cstmt=con.prepareCall(sql);
		
		cstmt.registerOutParameter(1, Types.INTEGER);
		
		cstmt.setInt(2, 25);
		cstmt.setInt(3, 125);
		
		cstmt.execute();
		System.out.println("The biggest number is " + cstmt.getInt(1));
		
//		if(ex==true)
//		{
//			System.out.println("SQL function executed successfully");
//			
//		}
//		else
//		{
//			System.out.println("Error calling the function");
//		}
		cstmt.close();
		con.close();
		}
		catch (ClassNotFoundException e) {

			System.out.println(e.getMessage());
			
		}
		catch (SQLException e) {

			System.out.println(e.getMessage());
			
		}
		catch (Exception e) {

			System.out.println(e.getMessage());
			
		}
	}

}
