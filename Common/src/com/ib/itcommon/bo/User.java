/**
 * 
 */
package com.ib.itcommon.bo;

/**
 * @author ib
 *
 */
public class User {

	private Integer id;
	private String email;
	private String password;
	private String name;
	private String firstName;

	/**
	 * @param id
	 * @param email
	 * @param password
	 * @param name
	 * @param firstName
	 */
	public User(Integer id, String email, String password, String name, String firstName) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.name = name;
		this.firstName = firstName;
	}

	/**
	 * 
	 */
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * function to sign
	 */
	public void signIn() {

	}

	/**
	 * function to log
	 */
	public void login() {

	}

	/**
	 * function to give a grade to Trainer and session
	 */
	public void giveGrade() {

	}

	/**
	 * controls if the user has adequate permissions
	 */
	public void checkStatuts() {

	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void add(User user) {
		// TODO Auto-generated method stub

	}

}
