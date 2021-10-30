package test;

import java.sql.*;

public class DBcon2 {

	public static void main(String[] args) {
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");
			
			Statement st=con.createStatement();
			
			ResultSet rs=st.executeQuery("select * from Employee35");
			
			while(rs.next())
			
			{
				
			System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getInt(4));
				
			}
			
			con.close();
		}
		catch(Exception e) {e.printStackTrace();	}

}
	
}
