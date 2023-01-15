package jtest;

import java.sql.*;

public class JdbcConnectionTest {

	public static void main(String[] args) throws Exception {
		
		String url = "jdbc:mysql://localhost:3306/poms";
		String username = "Surjeet";
		String password = "QAZwsx@1234";
		String query = "select * from customer";
		
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(url, username, password);
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(query);
		
		String name = rs.getString(1);
		st.close();
		conn.close();
		
		
	}

}
