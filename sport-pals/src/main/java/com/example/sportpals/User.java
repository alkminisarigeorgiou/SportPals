package com.example.sportpals;

public class User {
/** Every user have the following stats.  */
	private String userID; // User's ID that is auto increment from database.
	private String name; //User's name
	private String surname; // User's surname
	private String username; // User's username
	private String email; // User's email
	private String city; // User's city
	private String sport; // User's sport
	private String password; // User's password
	private String userStatus; // User's user status

	/**
	 * Constructor that creates the user with the following stats.
	 *
	 * @param name
	 * @param surname
	 * @param username
	 * @param email
	 * @param city
	 * @param sport
	 * @param password
	 */
	public User(String name, String surname, String username, String email, String city, String sport, String password) {

		this.name = name;
		this.surname = surname;
		this.username = username;
		this.email = email;
		this.city = city;
		this.sport = sport;
		this.password = password;
	}

	/* Getters & Setters */

	/**
	 * Getter username
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * Setter username
	 * @param username the new username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * Getter name
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Setter name
	 * @param name the new name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Getter surname
	 * @return the surname
	 */
	public String getSurname() {
		return surname;
	}

	/**
	 * Setter surname
	 * @param surname the new surname to set
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}

	/**
	 * Getter city
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * Setter city
	 * @param city the new phone to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * Getter sport
	 * @return the sport
	 */
	public String getSport() {
		return sport;
	}

	/**
	 * @param sport the new phone to set
	 */
	public void setSport(String sport) {
		this.sport = sport;
	}

	/**
	 * Getter email
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Setter email
	 * @param email the new email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * Getter password
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Setter password
	 * @param password the new password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * Getter userID
	 * @return the userID
	 */
	public String getUserID() {
		return userID;
		}

	/**
	 * Getter userStatus
	 * @return the userStatus
	 */
	public String getUserStatus() {
		return userStatus;
	}

	/**
	 * Setter userStatus
	 * @param userStatus the new user status to set
	 */
	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", name=" + name + ", surname=" + surname + ", city=" + city + ", sport=" + sport + ", email=" + email + ", userStatus=" + ", userID=" + userID + "]";
	}

} //End of class
