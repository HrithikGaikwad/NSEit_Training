package jdbc;
import java.sql.*;


public class UpdateData {
	
	public static void main(String[] args) throws SQLException {
		
		// 1. Load the driver

		 DriverManager.registerDriver(new com.mysql.jdbc.Driver());

		 // 2. Establish the connection
		String url = "jdbc:mysql://localhost:3306/hrithikdb";
		String username = "root";
		String password = "Hrithik@3099";
		Connection con = DriverManager.getConnection(url, username, password);

		 // 3. create the statement object

		 Statement st = con.createStatement();

		 // 4. write the query and execute it
		String sql = "update nseit set tech='Java' where empid=1002";

		 // 5. store the data in the result set
		int k= st.executeUpdate(sql);

		System.out.println("Data Updated");
		
		 // 6. close the connections
	//	rs.close();
		st.close();
		con.close();
		DriverManager.deregisterDriver(new com.mysql.jdbc.Driver());
	}
}
