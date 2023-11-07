package com.jdbc.config;
 
import java.sql.Connection;
import java.sql.DriverManager;


	public class DBconnect {

		public static void main(String[] args) throws SQLException {
			// TODO Auto-generated method stub
			String classPath="com.mysql.cj.jdbc.Driver";
		    String url="jdbc:mysql://localhost:3306/cijd_8133";
		    String username="root";
		    String password="root";
		    Connection con;
		    try {
				Class.forName(classPath);
				   System.out.println("Driver is found");
					con=DriverManager.getConnection(url,username,password);
					System.out.println("Conncted with the database");
					String query="select *from course";
					PreparedStatement ps=con.prepareStatement(query);
					ps.execute();
					System.out.println("Data has been inserted successfully");
				} 
		    catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}

		
		
		
	}

			

