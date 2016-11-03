package com.ufpe.cin.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class SuperService {
	
	protected String nameSchema = "";
	protected String user = "root";
	protected String password = "root";

	protected Connection opemConnectionDB() {
		Connection connection = null;
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + nameSchema, user, password);
		} catch (SQLException e) {
			System.out.println("[ERROR] - " + e.getMessage());
		}
		return connection;
	}
	
	public abstract String getNameTable();

}
