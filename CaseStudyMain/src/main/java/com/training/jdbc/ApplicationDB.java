package com.training.jdbc;

import java.sql.Connection;

import com.example.demo.jdbc.DbConnection;

public class ApplicationDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(DbConnection.getOracleConnection());
		
		Connection con = DbConnection.getOracleConnection();

	}

}
