package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// demo for jdbc program                         // 17-03-2026

public class JBBCSelect {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		// step 2: load and register the driver
		
		Class.forName("org.postgresql.Driver");
		
		System.out.println("load is completed");
		
		// step 3: Establish connection(url ,UN , PW)
		
		Connection conn=DriverManager.getConnection("jdbc:postgresql://localhost:5432/Reva","postgres","1234");
		System.out.println("connection completed");
		
		//step 4: create a statement
		                
		Statement st=conn.createStatement();
		
		// step 5: execute query
		
       String strselect="select sid,sname,semail from student";
	
       System.out.println("the sql statement is "+ strselect);
		
	// step 6: process the result
		
		ResultSet rst=st.executeQuery(strselect);
		System.out.println(" the records are");
		int rowcount=0;
		while(rst.next()) {
			int sid=rst.getInt("sid");
			String sname=rst.getString("sname");
			String semail=rst.getString("semail");
			
			System.out.println(sid +" "+sname+ " "+semail);
			
		}
		
		// insert query 
		
		String sqlinsert="insert into student values(4,'sushma','sushma@gmail.com')";
		System.out.println("query completed");
		
		int countinserted=st.executeUpdate(sqlinsert);
		System.out.println(countinserted +" record inserted");
		
	}

	
}