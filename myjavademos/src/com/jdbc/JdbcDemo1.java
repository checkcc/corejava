package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcDemo1 {
	public static void main(String args[]) {
		Connection connection = null;
		final String username = "himanshi.bhoria";
		final String password = "";
		String dbURL = "jdbc:sqlserver://localhost\\sqlexpress";

		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			connection = DriverManager.getConnection(dbURL, username, password);
			System.out.println("Connection Establishedd ");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}