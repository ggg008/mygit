package _191203_JDBC;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertZipCodeEx03
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		String url = "jdbc:mysql://127.0.0.1:3306/employees";
		String userID = "root";
		String password = "123456";	
				
		BufferedReader br = null;
		
		Connection conn = null;
		Statement stmt = null;

		
		try {
			br = new BufferedReader(new FileReader("./zipcode_seoul_utf8_type2.csv"));
			
			Class.forName("org.mariadb.jdbc.Driver");
			
			conn = DriverManager.getConnection(url, userID, password);
			stmt = conn.createStatement();
			
			int rowCnt = 0;
			String data = null;
			
			StringBuffer sql = new StringBuffer("INSERT INTO zipcode VALUES");
			
						
			while ((data = br.readLine()) != null) {
				
				String[] datas = data.split(",");
				//bulk INSERT
				sql.append(
						String.format("\n('%s', '%s', '%s', '%s', '%s', '%s', %s),", 
								datas[0], datas[1], datas[2], datas[3], datas[4], datas[5], datas[6])
						);
				
				
//				rowCnt += stmt.executeUpdate(sql);				
			}
//			sql.append(";");			
			
			sql.deleteCharAt(sql.length() - 1);
			
			System.out.println(sql.toString());
			
			rowCnt = stmt.executeUpdate(sql.toString());
			
			System.out.println("입력된 행수 : " + rowCnt);
			
			
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException : " + e.getMessage());
		} catch (IOException e) {
			System.out.println("IOException : " + e.getMessage());
		} catch (ClassNotFoundException e) {
			System.out.println("ClassNotFoundException : " + e.getMessage());
		} catch (SQLException e) {
			System.out.println("SQLException : " + e.getMessage());
		} finally {			
			if(stmt != null) try {stmt.close();} catch (Exception e2) {}		
			if(conn != null) try {conn.close();} catch (Exception e2) {}
			if(br != null) try {br.close();} catch (Exception e2) {}
		}
		
		
	}

}
