
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class CommitRollbackDemo {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
		c.setAutoCommit(false);
		
		Scanner s1=new Scanner(System.in);
		String name;
		int steps;
		String dsdate;
		
		System.out.println("Enter name : ");
		name=s1.nextLine();
		System.out.println("Enter date (yyyy-mm-dd) : ");
		dsdate=s1.nextLine();
		System.out.println("Enter steps : ");
		steps=s1.nextInt();
		
		PreparedStatement pstmt=c.prepareStatement("INSERT INTO DAILYSTEPS VALUES(?,?,?)");
		pstmt.setString(1, name);
		pstmt.setString(2, dsdate.trim());
		pstmt.setInt(3, steps);
		
		int cnt1=pstmt.executeUpdate();
		
		pstmt=c.prepareStatement("UPDATE TOTALSTEPS SET STEPS=STEPS+? WHERE NAME=?");
		pstmt.setInt(1, steps);
		pstmt.setString(2, name);
		
		int cnt2=pstmt.executeUpdate();
		
		if(cnt1>0 && cnt2>0)
		{
			System.out.println("Updated successfully");
			c.commit();
		}
		else
		{
			System.out.println("Update Unsuccessful");
			c.rollback();
		}
		s1.close();
		c.close();
	}

}
