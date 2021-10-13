package com.example.demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.*;

import com.training.jdbc.DbConnection;

public class UsingTranscaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con=DbConnection.getOracleConnection();
		try {
			con.setAutoCommit(false);

			String sql = "insert into student(rollNumber,studentName,markScored) "
			+ "values(201,'tom',56)";

			PreparedStatement pstmt = con.prepareStatement(sql);

			pstmt.executeUpdate();

			Savepoint sp1= con.setSavepoint("sp1");



			String sql2 = "insert into student(rollNumber,studentName,markScored)"
			+ "values(202,'tomtom',76)";

			PreparedStatement pstmt2 = con.prepareStatement(sql2);

			pstmt2.executeUpdate();

			Savepoint sp2 =con.setSavepoint("sp2");


			String sql3 = "insert into student(rollNumber,studentName,markScored) "
			+ "values(203,'pom',66)";

			PreparedStatement pstmt3 = con.prepareStatement(sql3);
			pstmt3.executeUpdate();

			Savepoint sp3 = con.setSavepoint("sp3");

			con.rollback(sp2);

			con.commit();

			System.out.println("Done");



			} catch (SQLException e) {
			e.printStackTrace();
			}
		
		try {
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
