package com.example.sportpals;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author paras
 */

public class DB {

	private final String dbServer = "127.0.0.1"; /** The Server of the db */
	private final String dbServerPort = "3306"; /** The Server Port of the db */
	private final String dbName = "sportpals"; /** The db Name */
	private final String dbusername = "root"; /** The Username of the db */
	private final String dbpassword = "iamsolas"; /** The Password of the db */

	/** The connection variable that holds the connection with the db. */
	private Connection con = null;

	/**
	 * Establishes a connection with the database, initializes and returns
	 * the Connection object.
	 *
	 * @return Connection, the Connection object
	 * @throws Exception
	 */
	public Connection getConnection() throws Exception {

		/* Step 1 -> Dynamically load the driver's class file into memory */

		try {

			// Dynamically load the driver's class file into memory
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();

		} catch (Exception e) {

			throw new Exception("MySQL Driver error: " + e.getMessage());
		}

		/*
		 * Step 2 -> Establish a connection with the database and initializes
		 * the Connection object (con)
		 */

		try {

			con = DriverManager.getConnection("jdbc:mysql://"
				+ dbServer + ":" + dbServerPort + "/" + dbName, dbusername, dbpassword);

			// Step 3 -> returns the connection object
			return con;

		} catch (Exception e) {

			// throw Exception if any error occurs
			throw new Exception("Could not establish connection with the Database Server: "
				+ e.getMessage());
		}

	} // End of getConnection

	/**
	 * The method that close the connection with the db.
	 *
	 * @throws SQLException
	 */
	public void close() throws SQLException {

		try {

			// if connection is (still) open
			if (con != null)
				con.close(); // close the connection to the database to end database session

		} catch (SQLException e) {

			throw new SQLException("Could not close connection with the Database Server: "
				+ e.getMessage());
		}

	}// end of close

} // End of class