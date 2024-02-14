package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBase {
	private static Connection conn = null;
	
	public static Connection getConnection() {
		if(conn == null) {
			try {
				String url = "jdbc:mysql://localhost:3306/coursejdbc";
				
				conn = DriverManager.getConnection(url, "devuser", "Senhacansada");
				System.out.println("Connection made");
			} catch(SQLException e) {
				throw new DbException("Error: " + e.getMessage());
			}
		}
		return conn;
	}
	public static void closeConnection() {
		if(conn != null) {
			try {
				conn.close();
				System.out.println("Closed connection");
			} catch(SQLException e) {
				throw new DbException("Error: " + e.getMessage());
			}
		}
	}
	public static void closeStatement(Statement st) {
		if(st != null) {
			try {
				st.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void closeResultSet(ResultSet rs) {
		if(rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
}
