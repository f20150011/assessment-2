package com.sapient.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.sapient.dto.Data;

public class RepositoryPSQLImpl implements IRepository {

	@Override
	public void save(Data data) {
		try {
			
			// creating connection
			Class.forName("org.postgresql.Driver");
			Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/sapient", "postgres","root");
			connection.setAutoCommit(false);
			
			// executing stmt
			Statement stmt = connection.createStatement();
			String sql = "INSERT INTO User (name,age,salary) " + "VALUES ('" + data.getName() + "','"
					+ data.getAge() + "'," + data.getSalary() + ");";
			stmt.executeUpdate(sql);
			stmt.close();
			
			// committing and closing 
			connection.commit();
			connection.close();
			
		} catch (Exception e) {
			
			// print stack trace
			e.printStackTrace();
		}
	}

}
