package com.example.sportpals;



import java.util.ArrayList;
import java.util.List;
import java.sql.*;


/**
 * UserDAO provides all the necessary methods related to the user's.
 * JDBC API is used for database connection and saving/retrieving users etc.
 * @author
 */
public class UserDAO {

	/**
	 * Register/create new User.
	 *
	 * @param user, User
	 * @throws Exception, if encounter any error.
	 */
	public void register(User user) throws Exception {

		Connection con = null ;
		DB db4 = new DB();
		String insertsql1 = "INSERT INTO USERS"
				+ " (name, surname, username, email, city, sport, password)"
				+ " VALUES (?, ?, ?, ?, ?, ?, ?);";

		try {

			con = db4.getConnection();

			PreparedStatement stmt4 = con.prepareStatement(insertsql1);

			stmt4.setString(1, user.getName());
			stmt4.setString(2, user.getSurname());
			stmt4.setString(3, user.getUsername());
			stmt4.setString(4, user.getEmail());
			stmt4.setString(5, user.getCity());
			stmt4.setString(6, user.getSport());
			stmt4.setString(7, user.getPassword());

			stmt4.executeUpdate();

			stmt4.close();
			db4.close();
		} catch (Exception e) {
			throw new Exception(e.getMessage());

		} finally {

			if(con != null)
				con.close();
		}

	}//end of register


} //End of class
