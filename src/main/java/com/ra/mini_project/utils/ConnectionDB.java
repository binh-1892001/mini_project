package com.ra.mini_project.utils;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {
	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/mini_project";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "123456";
	
	public static Connection openConnection() {
		Connection con;
		try {
			Class.forName(DRIVER);
			con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (ClassNotFoundException | SQLException e) {
			throw new RuntimeException(e);
		}
		return con;
	}
	
	public static void closeConnection(Connection con) {
		if(con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
		}
	}
	
}
