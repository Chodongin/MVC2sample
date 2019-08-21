package cDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import eDB.DBClose;
import eDB.DBConnection;
import dModel.ExampleDto;

public class ExampleDao {
	private Connection conn;
	private PreparedStatement psmt;
	private ResultSet rs;
	private String sql;
	List<ExampleDto> list = new ArrayList<ExampleDto>();
	
	public ExampleDao() {
		DBConnection.initConnection();
	}
	
	public static ExampleDao getInstance(){
		return new ExampleDao(); 
	}
	
	public ExampleDto loginAction(ExampleDto param){
		String sql 	= " SELECT ID, PASSWORD, NAME "
				   	+ " FROM EXAMPLE "
				   	+ " WHERE ID = ? "
				   	+ "	  AND PASSWORD = ? ";
		
		ExampleDto dto = new ExampleDto();
		
		try {
			conn = DBConnection.getConnection();
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, param.getId());
			psmt.setString(2, param.getPassword());
		
			rs = psmt.executeQuery();
			
			rs.next();
			dto.setId(rs.getString("ID"));
			dto.setPassword(rs.getString("PASSWORD"));
			dto.setName(rs.getString("NAME"));
			/*dto.setId(rs.getString(1));
			dto.setPassword(rs.getString(2));
			dto.setName(rs.getString(3));
			list.add(dto);*/
			
		} catch (SQLException e) {
			System.err.println(e.toString());
		}finally {
			DBClose.close(conn, psmt, rs);
		}
		
		return dto;
	}
}
