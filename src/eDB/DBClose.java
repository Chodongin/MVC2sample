package eDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBClose {
		
	public static void close(Connection conn, PreparedStatement psmt, ResultSet rs) {
		try {
			if(rs != null) {
				rs.close();
			}	
			if(psmt != null) {
				psmt.close();
			}
			if(conn != null) {
				conn.close();
			}
			//System.out.println("DB Close Success");		
		} catch (SQLException e) {
			e.printStackTrace();
		}		
	}

}
