package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcDemo {
	public static void main(String ar[]) {

		Connection connection = null;
		final String username = "root";
		final String password = "roo";
		final String jdbcurl = "jdbc:mysql://localhost:3306/jdbcdemo";
		//Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");   for ms server

		// String dbURL = "jdbc:sqlserver://localhost\\sqlexpress";
		// String user = "sa";
		// String pass = "";

		try {

			Class.forName("com.mysql.jdbc.Driver"); ///

			connection = DriverManager.getConnection(jdbcurl,username,password);///authentication

			System.out.println("connected...");

		} catch (Exception e) {
			e.printStackTrace();

		}

	}

}
