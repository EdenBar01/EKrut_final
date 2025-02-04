package entities;

import java.io.Serializable;

import enums.Region;
import enums.Role;

public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String username;
	private String password;
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	private boolean isLoggedIn;
	private String id;
	private Role role;
	private Region region;

	public User(String username, String password, String firstName, String lastName, String email, String phoneNumber,
			boolean isLoggedIn, String id, Role role, Region region) {
		super();
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.isLoggedIn = isLoggedIn;
		this.id = id;
		this.role = role;
		this.region = region;
	}


	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmail() {
		return email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public boolean isLoggedIn() {
		return isLoggedIn;
	}

	public String getId() {
		return id;
	}

	public Role getRole() {
		return role;
	}

	public Region getRegion() {
		return region;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setLoggedIn(boolean isLoggedIn) {
		this.isLoggedIn = isLoggedIn;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public void setRegion(Region region) {
		this.region = region;
	}
}