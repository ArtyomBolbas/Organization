package model.hierarchy.of.employees;

import java.io.Serializable;

import model.company.Remove;

public abstract class Administration extends Employee implements Remove, Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2147183269303671864L;

	// ----------------------------------------------
	// поля, свойства необходимые Administration
	// ----------------------------------------------
	private String login;
	
	private String password;

	// ----------------------------------------------
	// сеттеры, геттеры
	// ----------------------------------------------
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
