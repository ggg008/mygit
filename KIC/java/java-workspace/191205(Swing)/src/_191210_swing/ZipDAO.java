package _191210_swing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ZipDAO
{
	private Connection conn = null;
	
	public ZipDAO()
	{
		// TODO Auto-generated constructor stub		

		String url = "jdbc:mysql://127.0.0.1:3306/employees";
		String user = "root";
		String password = "123456";

		try {
			Class.forName("org.mariadb.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	public ArrayList<ZipTO> selectZip()
	{
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		ArrayList<ZipTO> results = new ArrayList<ZipTO>();
		
		try {
			String sql = "SELECT * FROM zipcode";
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				
				ZipTO to = new ZipTO();				
				
				to.setZipcode(rs.getString("Zipcode"));
				to.setSido(rs.getString("Sido"));
				to.setGugun(rs.getString("Gugun"));
				to.setDong(rs.getString("Dong"));
				to.setRi(rs.getString("Ri"));
				to.setBunji(rs.getString("Bunji"));
				to.setSeq(rs.getString("Seq"));				
				
				results.add(to);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("SQLException :" + e.getMessage());
		} finally {
			if(rs != null) try {rs.close();} catch (Exception e2) {}
			if(pstmt != null) try {pstmt.close();} catch (Exception e2) {}
			if(conn != null) try {conn.close();} catch (Exception e2) {}
			
		}
		
		return results;		
	}
}