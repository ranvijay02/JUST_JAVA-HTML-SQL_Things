package com.deloitte.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Enumeration;
import java.util.Properties;

public class DBUtil {
	
	private static Connection conn = null;
	public static Connection getConnection() {
		
		Properties props = new Properties();
		String DRIVER = "", URL = "", USER = "", PASSWORD = "";
		try {
			if (conn == null || conn.isClosed()) {
				props.load(new FileInputStream("C:/Deloitte_Dec2019/Workspace/FirstWebApplication1/WebContent/db.config"));
				Enumeration em = props.propertyNames();
				String key = (String) em.nextElement();
				DRIVER = props.getProperty("DRIVER");
				URL = props.getProperty("URL");
				USER = props.getProperty("USER");
				PASSWORD = props.getProperty("PASSWORD");

				Class.forName(DRIVER);
				System.out.println("Driver loaded");
				conn = DriverManager.getConnection(URL, USER, PASSWORD);
				System.out.println("Connection Established");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return conn;
	}

	public static void closeConnection() {
		if (conn !=null) {
			try {
				conn.close();
			} catch (SQLException e) {
		
				e.printStackTrace();
			}	
		}
		
	}
}
